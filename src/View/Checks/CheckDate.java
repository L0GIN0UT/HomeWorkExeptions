package View.Checks;

import View.Checks.exeptions.DateExeption;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckDate {

    public static LocalDate checkDate(String data) throws DateExeption {
        if(data.isEmpty()){
            throw new DateExeption("Вы не ввели дату! " + data);
        }
        try {
            String[] dateParts = data.split("\\.");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);
            LocalDate bornDate = LocalDate.of(year, month, day);
            if(bornDate.isAfter(LocalDate.now())){
                throw new DateExeption("ВЫ ИЗ БУДУЩЕГО ?!" + data, bornDate);
            }
            else if(bornDate.isBefore(LocalDate.of(1850, 1, 1))){
                throw new DateExeption("Вы не можете быть настолько старым! " + data, bornDate);
            }
            return bornDate;
        } catch (DateTimeException e) {
            throw new DateExeption("Некорректный формат даты " + data);
        }
    }

    //if(familia == null) {
//            throw new FamiliaExeption("Вы не ввели Фамилию! ", null);
//        }
//        else if(familia.length() < 2){
//            throw new FamiliaExeption("Некорректная длина Фамилии (< 2) ", familia);
//        }
//        else if(name == null) {
//            throw new NameExeption("Вы не ввели Имя! ", null);
//        }
//        else if(name.length() < 2){
//            throw new NameExeption("Некорректная длина Имени (< 2) ", name);
//        }
//        else if(otchestvo == null) {
//            throw new OtchestvoExeption("Вы не ввели Отчество! ", null);
//        }
//        else if(otchestvo.length() < 5){
//            throw new OtchestvoExeption("Некорректная длина Отчества (< 5) ", otchestvo);
//        }



}
