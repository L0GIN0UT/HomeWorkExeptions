package View;

import View.Checks.exeptions.*;
import View.Commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commands;

    public Menu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddPerson(consoleUI));
        commands.add(new GetPhoneBook(consoleUI));
        commands.add(new DownloadPhoneBook(consoleUI));
        commands.add(new SavePhoneBook(consoleUI));
        commands.add(new Finish(consoleUI));
    }
    public String menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu \n");
        for (int i = 0; i < commands.size(); i++) {
            Command c = commands.get(i);
            sb.append(i + 1);
            sb.append(". ");
            sb.append(c.getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void choise(int id) throws FamiliaExeption, OtchestvoExeption, DateExeption, NameExeption, PhoneNumberExeption, GenderExeption, FileNameExeption, FileNameUploadExeption {
        try{
            Command c = commands.get(id - 1);
            c.execute();
        } catch (IndexOutOfBoundsException e){
            throw new ConsoleIndexExeption("Вы выбрали опцию которой не существует!");
        }
    }


    public int size(int choise) {
        return commands.size();
    }
}
