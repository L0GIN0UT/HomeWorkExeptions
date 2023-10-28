package View.Checks;

import View.Checks.exeptions.OtchestvoExeption;

public class CheckOtchestvo {
    public static String checkOtchestvo(String str) throws OtchestvoExeption {
        if(!str.isEmpty()) {
            if (str.length() < 5) {
                throw new OtchestvoExeption("Некорректная длина Отчества (< 5) ", str);
            } else{
                return str;
            }
        } else {
            throw new OtchestvoExeption("Вы не ввели Отчество", null);
        }
    }
}
