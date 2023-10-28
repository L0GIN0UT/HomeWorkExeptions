package View.Checks.exeptions;

public class ConsoleExeption extends CustomExeption{
    private String msg;

    public ConsoleExeption(String message, String msg) {
        super(message);
        this.msg = msg;
    }

    public ConsoleExeption(String message) {
        super(message);
    }
}
