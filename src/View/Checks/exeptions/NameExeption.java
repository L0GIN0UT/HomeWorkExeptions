package View.Checks.exeptions;

public class NameExeption extends CustomExeption{
    private final String name;

    public NameExeption(String message, String name) {
        super(message);
        this.name = name;
    }
}
