package View.Checks.exeptions;

public class ConsoleIndexExeption extends IndexOutOfBoundsException{
    private String msg;

    public ConsoleIndexExeption(String message, String msg) {
        super(message);
        this.msg = msg;
    }

    public ConsoleIndexExeption(String message) {
        super(message);
    }
}
