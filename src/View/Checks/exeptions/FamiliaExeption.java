package View.Checks.exeptions;

public class FamiliaExeption extends CustomExeption{
    private final String familia;

    public FamiliaExeption(String message, String familia) {
        super(message);
        this.familia = familia;
    }
}
