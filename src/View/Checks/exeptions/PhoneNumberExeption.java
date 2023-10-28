package View.Checks.exeptions;

public class PhoneNumberExeption extends CustomExeption{
    private long phoneNumber;

    public PhoneNumberExeption(String message, long phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumberExeption(String message) {
        super(message);
    }
}
