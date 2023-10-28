package Presenter;

import Model.obj.Gender;
import Model.service.Service;
import View.Checks.exeptions.FileNameExeption;
import View.ConsoleUI;

import java.time.LocalDate;

public class Presenter {
    private ConsoleUI view;
    private Service service;

    public Presenter(ConsoleUI view) {
        this.view = view;
        service = new Service();
    }

    public void addPerson(String familia, String name, String otchestvo, LocalDate bornDate, long phoneNumber,
                         Gender gender) {
        service.addPerson(familia,name,otchestvo,bornDate,phoneNumber,gender);
    }

    public void getPersonList(){
        String answer = service.getInfo();
        view.printAnswer(answer);
    }

    public void saveBook(String filename) {
        service.saveBook(filename);
    }

    public void readBook(String filename) throws FileNameExeption {
        service.readBook(filename);
    }

}
