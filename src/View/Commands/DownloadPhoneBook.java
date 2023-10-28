package View.Commands;

import View.Checks.exeptions.FileNameDownloadExeption;
import View.ConsoleUI;

public class DownloadPhoneBook extends Command{

    public DownloadPhoneBook(ConsoleUI consoleUI){
        super("Загрузить телефонную книгу",consoleUI);
    }
    public void execute() throws FileNameDownloadExeption {
        getConsoleUI().downloadBook();
    }

}
