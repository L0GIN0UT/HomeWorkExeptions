package View.Commands;

import View.Checks.exeptions.*;
import View.ConsoleUI;

public abstract class Command {

    private String description;

    private ConsoleUI consoleUI;

    public Command(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public abstract void execute() throws DateExeption, FamiliaExeption, OtchestvoExeption, NameExeption, PhoneNumberExeption, GenderExeption, FileNameExeption, FileNameUploadExeption;
}
