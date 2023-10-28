import View.Checks.exeptions.*;
import View.ConsoleUI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FamiliaExeption, OtchestvoExeption, DateExeption, NameExeption, PhoneNumberExeption {
        try {
            ConsoleUI console = new ConsoleUI();
            console.start();
        }catch (FamiliaExeption | NameExeption | DateExeption | OtchestvoExeption | PhoneNumberExeption |
                ConsoleIndexExeption | ConsoleExeption | GenderExeption e){
            System.out.println(e.getMessage());
        }
    }
}