package View.Commands;

import View.ConsoleUI;

public class GetPhoneBook extends Command{
    public GetPhoneBook(ConsoleUI consoleUI){
        super("Вывести Телефонную книгу",consoleUI);
    }
    public void execute() {
        getConsoleUI().getPersonList();
    }
}
