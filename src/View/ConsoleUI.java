package View;

import Model.obj.Gender;
import Presenter.Presenter;
import View.Checks.*;
import View.Checks.exeptions.*;


import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Menu menu;
    private Scanner scanner;
    private Presenter presenter;
    private boolean flag;

    public ConsoleUI() {
        menu = new Menu(this);
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        flag = true;
    }

    @Override
    public void start() throws FamiliaExeption, OtchestvoExeption, DateExeption, NameExeption, PhoneNumberExeption, ConsoleExeption, GenderExeption {
        System.out.println("Hello: ");
        while (flag) {
            System.out.println(menu.menu());
            String line = scanner.nextLine();
            try {
                int choise = Integer.parseInt(line);
                menu.choise(choise);
            } catch (NumberFormatException e) {
                throw new ConsoleExeption("Вы ввели не число!");
            }
        }
    }

    public void finish() {
        flag = false;
    }

    public void addHuman() throws DateExeption, NameExeption, FamiliaExeption, OtchestvoExeption, PhoneNumberExeption, GenderExeption {
        System.out.println("Укажите Фамилию человека");String familia1 = scanner.nextLine();String familia = checkFamilia(familia1);
        System.out.println("Укажите Имя человека");
        String name1 = scanner.nextLine();
        String name = checkName(name1);
        System.out.println("Укажите Отчество человека");
        String otchestvo1 = scanner.nextLine();
        String otchestvo = checkOtchestvo(otchestvo1);
        System.out.println("Укажите Дату Рождения человека \nПример: дд.мм.гггг");
        String bornDate1 = scanner.nextLine();
        LocalDate bornDate = checkDate(bornDate1);
        System.out.println("Укажите Телефон человека \nПример: 81231231212 или 123456");
        String phoneNumber1 = scanner.nextLine();
        long phonrNumber = checkPhoneNumber(phoneNumber1);
        System.out.println("Укажите Пол человека (М или Ж)");
        String gender1 = scanner.nextLine();
        Gender gender = checkGender(gender1);
        presenter.addPerson(familia,name,otchestvo,bornDate,phonrNumber,gender);
    }

    private String checkFamilia(String str) throws FamiliaExeption {
        return CheckFamilia.checkFamilia(str);
    }

    private String checkName(String str) throws NameExeption {
        return CheckName.checkName(str);
    }

    private String checkOtchestvo(String str) throws OtchestvoExeption {
        return CheckOtchestvo.checkOtchestvo(str);
    }

    private long checkPhoneNumber(String str) throws PhoneNumberExeption {
        return CheckNumber.checkNumber(str);
    }

    private Gender checkGender(String str) throws GenderExeption {
        return CheckGender.checkGender(str);
    }

    private LocalDate checkDate(String str) throws DateExeption {
        return CheckDate.checkDate(str);
    }

    public void getPersonList(){
        presenter.getPersonList();;
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
