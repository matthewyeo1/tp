## Quick Start

1.  Ensure you have Java 17 or above installed on your PC. **[Version 17 is preferred]**
2.  You may download [here](https://se-education.org/guides/tutorials/javaInstallationMac.html) for Mac users and [here](https://www.oracle.com/sg/java/technologies/downloads/) for Windows users.
3.  If you have it installed already, you may check it by running `java -version` in your terminal.
4.  Download the latest `.jar` file from here. **[link will be updated once v1 is ready]**
5.  Copy the file to the folder you want to use as the home folder for your **O$P$ budget tracking app** 🙂.
6.  Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar o$p$.jar` command to run the application.
7.  Type the command in the command box and press **Enter** to execute it.
8.  **Example:** Typing `help` and pressing **Enter** will open a mini window showing a list of all possible commands.
9.  Refer to the [features](https://docs.google.com/document/d/125Cg7wzuc4XFo3wsziwL2f64KN1uUfvFL5dIm6IQrSk/edit?tab=t.xl7ogrtj0a5q#heading=h.61o02m6y9xrc) section below for details on all commands and functionalities.

---

## Feature List

### Admin:

#### Viewing help: `help`

Lists the commands available to the user.

- **Usage:** `help`
- **Expected output:** _[To insert list of commands that will be returned]_

---

#### Exiting the program: `exit`

Terminates the program and saves the user's data, such as their payee list, groups, balance, and transaction information to a `.csv` file.

- **Usage:** `exit`
- **Expected output:** _[Save aforementioned data into file and produce an exit message]_

---

## Manage Balance:

#### Add an expense: `add`

Add an expense with a title, description, date, amount.

- **Usage:**

  ```
  add
  Enter expense title:
  User input: Breakfast
  Enter expense description:
  User input: 1x Big Breakfast from McDonald's
  Enter date of expense (DD-MM-YYYY):
  User input: 01-01-2025
  Enter expense amount:
  10

  ```

- **Expected output:** _[A short summary of the added expense will appear]_

  The entry will automatically be tagged with a unique expense ID.

---

#### Delete an expense: `delete`

Delete expenses to remove unwanted expenses.

- **Format:** `delete <expense ID>`
- **Usage:** `delete 2`

---

#### Edit an expense: `edit`

Edit an existing expense.

- **Format:**

  ```
  edit
  "Enter the index of the expense to edit" <index of expense>
  "Enter the expense details"
  "Title:" <New title>
  "Description:" <New description>
  "Date:" <New date>
  "Amount:" <New amount>
  ```

- **Usage:**

  ```
  edit
  "Enter the index of the expense to edit"
  User input:1
  "Enter the expense details"
  "Enter new title (press Enter to keep current):"
  User input: Edited expense 1
  "Enter new description (press Enter to keep current):"
  User input: New description
  "Enter new date (press Enter to keep current):"
  User input: 02-01-2025
  "Enter new amount (press Enter to keep current):"
  20
  ```

- **Expected output:** _[A short summary of the edited expense will appear]_

---

#### View all expenses: `list`

View all the expenses.

- **Format:** `list`
- **Usage:** `list`
- **Example:**
  ```
  List of Expenses:
  Expense #1
  Title: test expense
  Description: testing testing
  Date: 01-01-2025
  Amount: $50.00
  ```

---

#### View unsettled expenses: `list-unsettled`

View expenses you owe or is owed to you.

- **Format and Usage:** `list-unsettled`
- **Example:**

  ```
  All expenses are in SGD
  Expense #1
  Title: test expense
  Description: testing testing
  Amount: $50.00

  You have 1 unsettled expense
  ```

---

#### View settled expenses: `list-settled`

View expenses that are marked as settled using "mark" command.

- **Format and Usage:** `list-settled`
- **Example:**

  ```
  All expenses are in SGD
  Expense #1
  Title: test expense
  Description: testing testing
  Date: 01-01-2025
  Amount: $50.00

  You have 1 settled expense
  ```

---

#### Mark settled expenses: `mark`

Once a transaction is made, the user can mark it as paid.

- **Format and Usage:** `mark`
- **Example:**
  ```
  mark
  "Enter expense number to mark:"
  User input: 1
  ```

---

#### Unmark settled expenses: `unmark`

User can unmark an expense that has been marked already.

- **Format and Usage:** `unmark`
- **Example:**
  ```
  "Enter expense number to unmark"
  User input: 1
  ```
  
---

#### Find from previous expenses: `find`
User can unmark an expense that has been marked already.
- **Format and Usage:** `find`
- **Example:**
  ```
  "Enter keyword to search for expenses:"
  User input: taxi
  ```
- The application then returns all the expenses that resemble this keyword.
---

#### Change currency: `change-currency`

User can change the currency all expenses are in

- **Format and Usage:** `change-currency`
- **Example 1:**
  ```
  "[1] Enter your own exchange rate from the current currency"
  "[2] Switch currencies with an estimated exchange rate"
  "Enter option:"
  User input: 1
  "Note: Please enter currency based on ISO 4217 standard (eg: SGD, USD, JPY)"
  "Please enter a currency to change to"
  User input: USD
  "Please input your exchange rate from SGD to a new currency"
  User input: 0.75
  "Currency successfully changed to USD"
  ```
  - **Usage example 2:**
  ```
  "[1] Enter your own exchange rate from the current currency"
  "[2] Switch currencies with an estimated exchange rate"
  "Enter option:"
  User input: 2
  "Your current currency is SGD"
  "Note: Please enter currency based on ISO 4217 standard (eg: SGD, USD, JPY)"
  "Please enter a currency to change to"
  User input: USD
  "Currency successfully changed to USD"
  ```

---

#### View balance in wallet: `balance`

Shows total money to be paid and total money to pay.

- **Output:**
  ```
  Total money to pay: <total amount user owes>
  Total money to receive: <total amount user is owed>
  ```

---

## Manage Group Members:

#### View Friends in a group: `create-group`

Create a new group to split expenses with.

- **Usage:**

  ```
  create-group
  "Enter the group name:" test group
  "Who would you like to add to the group? (Type 'done' to finish)"
  "Enter name:" apple
  "Enter name:" mango
  "Enter name:" carrot
  "Enter name:" done
  Group created successfully!

  ```

---

#### Add Friends to a group: `view-group`

View a specific group and see how much each member owes.

- **Usage:**

  ```
  view-group
  Enter the group name to view: TestGroup
  Group: TestGroup
  Members of group "TestGroup":
  - Alice owes: 25.00
  - Bob owes: 25.00

  ```

---

#### Add Friends to a group: `add-member`

Adds a user to a group.

- **Usage:**

  ```
  add-member
  Enter the name of the member to add: natasha
  Enter the group name: TestGroup
  natasha has been added to TestGroup

  ```

---

#### Add Friends to a group: `remove-member`

Removes a member from a group

- **Usage:**

  ```
  remove-member
  Enter the name of the member to remove: natasha
  Enter name of group to remove member from: TestGroup

  ```

---

#### Add Friends to a group: `my-groups`

Shows all the user's groups.

- **Usage:**

  ```
  my-groups
  Group Name: TestGroup
  Members:
  - Alice
  - Bob
  - natasha

  Group Name: NewGroup
  Members:
  - Charlie

  Group Name: test group
  Members:
  - apple
  - mango
  - carrot
  ```

---

#### Add Friends to a group: `remove-group`

Removes an entire group.

- **Usage:**

  ```
  remove-group
  Enter the name of the group to remove: TestGroup

  ```

---

## Manage Payments:

#### Select split method: `split`

Splits an expense among members of a group either equally or manually (via absolute amounts or percentages).

- **Usage:**

  ```
  split
  [1] Split equally among all members of the selected group
  [2] Manually assign amounts for each member in a group
  [x]: Cancel
  Enter option: 1

  Available expenses:
  1. Lunch | Amount: 100.00
  Enter expense number to split: 1

  Enter group name for equal split: friends
  Splitting 100.00 equally among 2 members of group "friends":
  - Alice owes: 50.00
  - Bob owes: 50.00

  Updated list of transactions!
  Here is the updated balance for group: friends
  ```

- **Manual Split (absolute amounts):**

  ```
  split
  [1] Split equally among all members of the selected group
  [2] Manually assign amounts for each member in a group
  [x]: Cancel
  Enter option: 2

  Available expenses:
  1. Dinner | Amount: 100.00
  Enter expense number to split: 1

  Enter group name for manual split: friends
  Type '/a' for absolute amounts OR '/p' for percentages: /a

  Total expense amount to split: 100.00
  You can assign up to 100.00 in total.
  Enter amount for Alice: 30
  Remaining expense: 70.00
  Enter amount for Bob: 70

  Updated list of transactions!
  ```

- **Manual Split (percentages):**

  ```
  split
  [1] Split equally among all members of the selected group
  [2] Manually assign amounts for each member in a group
  [x]: Cancel
  Enter option: 2

  Available expenses:
  1. Brunch | Amount: 200.00
  Enter expense number to split: 1

  Enter group name for manual split: friends
  Type '/a' for absolute amounts OR '/p' for percentages: /p

  Total expense is 200.00. You can assign up to 100% in total.
  Enter percentage for Alice: 40
  Remaining percentage: 60.00%
  Enter percentage for Bob: 60

  - Alice owes: 80.00
  - Bob owes: 120.00

  Updated list of transactions!
  Here is the updated balance for group: friends
  ```

---
### Select split method: `split`

Allows an expense to be split among a certain group, either equally or via manually specified amounts/percentages.

- **Format:** `split`

- **Example output:**
  ```
  [1] Split equally among all members of the selected group
  [2] Manually input percentage and members involved in transaction
  [x]: Cancel
  ```
- **Next steps:**
  ```
  Select Transaction to split
  Select group to split transaction with
  *If selected [2] before, choose whether to split via absolute amounts or via percentage
  Will display the total amounts owed by each member
  ```

---


## Expense Analytics:

#### View summary of expenses: `summary`

Displays comprehensive analytics of your expenses through different visualization options. This command helps you track and analyze your spending patterns.

- **Usage:** `summary`

- **Options:**

  1. **Monthly Summary**

     - Shows total expenses for each month
     - Displays a month-by-month comparison
     - Includes percentage changes between months

  2. **Category-wise Summary**

     - Breaks down expenses into categories (Food, Travel, Entertainment, Shopping, Miscellaneous)
     - Shows percentage distribution across categories
     - Highlights your highest spending category
     - Provides month-to-month category comparison

  3. **Back to main menu**
     - Returns to the main interface

- **Example output:**

  ```
  === Monthly Summary ===
  January 2024: $1,200
  - Food: 40%
  - Travel: 25%
  - Entertainment: 15%
  - Shopping: 10%
  - Miscellaneous: 10%

  Total Expenses: $1,200
  Highest Category: Food ($480)
  ```

---
