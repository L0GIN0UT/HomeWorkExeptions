package View.Checks;

import View.Checks.exeptions.FamiliaExeption;

public class CheckFamilia {
    public static String checkFamilia(String str) throws FamiliaExeption {
        if(!str.isEmpty()) {
            if (str.length() < 3) {
                throw new FamiliaExeption("Некорректная длина Фамилии (< 3) ", str);
            } else{
                return str;
            }
        } else {
            throw new FamiliaExeption("Вы не ввели Фамилию", null);
        }
    }
}
