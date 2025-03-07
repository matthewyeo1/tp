package seedu.duke.ui;
import java.util.Scanner;
import seedu.duke.messages.Messages;
import seedu.duke.commands.Commands;
import seedu.duke.menu.HelpPage;
import seedu.duke.storage.DataStorage;

public class UI {
    private final Scanner scanner;
    private final Messages messages;
    private final HelpPage helpPage;
    private final String storageFilePath;

    public UI (Scanner scanner, Messages messages, HelpPage helpPage, String storageFilePath) {
        this.scanner = scanner;
        this.messages = messages;
        this.helpPage = helpPage;
        this.storageFilePath = storageFilePath;
    }
    
    public void handleUserInput() {
        messages.inputIndicator();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase(Commands.HELP)) {
                helpPage.displayCommandList();
                messages.setDivider();
            } else if (input.equalsIgnoreCase(Commands.CATEGORIES)) {
                messages.setDivider();
                DataStorage.displayStoredData(storageFilePath);
                messages.setDivider();
            } else if (input.contains(Commands.EXIT_APP)) {
                messages.setDivider();
                messages.exitAppMessage();
                messages.setDivider();
                break;
            } else {
                messages.setDivider();
                messages.invalidCommandMessage();
                messages.setDivider();
            }
            messages.inputIndicator();
        }
        scanner.close();
    }
}

