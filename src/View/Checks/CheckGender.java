package View.Checks;

import Model.obj.Gender;
import View.Checks.exeptions.GenderExeption;

import java.util.Locale;

public class CheckGender {
    public static Gender checkGender(String str) throws GenderExeption {
        String gender = str.toUpperCase();
        if(!gender.isEmpty()){
            if (gender.equals("М")) {
                return Gender.MALE;
            } else if (gender.equals("Ж")) {
                return Gender.FEMALE;
            } else {
                throw new GenderExeption("Некорректный Пол " + str);
            }
        } else {
            throw new GenderExeption("Вы не ввели Пол");
        }
    }
}
