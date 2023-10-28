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

}
