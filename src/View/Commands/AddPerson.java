package View.Commands;

import View.Checks.exeptions.*;
import View.ConsoleUI;

public class AddPerson extends Command{
    public AddPerson(ConsoleUI consoleUI){
        super("Добавить Контакт",consoleUI);
    }
    public void execute() throws DateExeption, FamiliaExeption, OtchestvoExeption, NameExeption, PhoneNumberExeption, GenderExeption {
        getConsoleUI().addHuman();
    }
}
