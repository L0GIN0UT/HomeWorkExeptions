package View.Checks;

import Model.obj.Gender;
import View.Checks.exeptions.GenderExeption;
import View.Checks.exeptions.NameExeption;

public class CheckName {
    public static String checkName(String str) throws NameExeption {
        if(!str.isEmpty()) {
            if (str.length() < 2) {
                throw new NameExeption("Некорректная длина Имени (< 2) ", str);
            } else{
                return str;
            }
        } else {
            throw new NameExeption("Вы не ввели Имя", null);
        }
    }
}
