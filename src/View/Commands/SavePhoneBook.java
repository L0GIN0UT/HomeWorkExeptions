package View.Commands;

import View.Checks.exeptions.FileNameExeption;
import View.Checks.exeptions.FileNameUploadExeption;
import View.ConsoleUI;

public class SavePhoneBook extends Command {
    public SavePhoneBook(ConsoleUI consoleUI){
        super("Сохранить дерево",consoleUI);
    }
    public void execute() throws FileNameExeption, FileNameUploadExeption {
        getConsoleUI().uploadBook();
    }
}
