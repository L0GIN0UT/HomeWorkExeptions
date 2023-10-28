package View.Checks;

import View.Checks.exeptions.PhoneNumberExeption;

public class CheckNumber {
    public static long checkNumber(String str) throws PhoneNumberExeption {
        if(!str.isEmpty()) {
            if(str.length() == 6 | str.length() == 11){
                long number = Long.parseLong(str);
                return number;
            }
            else{
                throw new PhoneNumberExeption("Номер телефона не существует! " + str);
            }
        } else {
            throw new PhoneNumberExeption("Вы не ввели номер! " + str);
        }

    }
}

