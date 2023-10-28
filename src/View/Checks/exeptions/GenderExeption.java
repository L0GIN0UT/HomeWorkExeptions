package View.Checks.exeptions;

import Model.obj.Gender;

public class GenderExeption extends CustomExeption{
    private Gender gender;

    public GenderExeption(String message, Gender gender) {
        super(message);
        this.gender = gender;
    }

    public GenderExeption(String message) {
        super(message);
    }
}
