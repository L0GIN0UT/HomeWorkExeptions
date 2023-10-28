package View.Checks.exeptions;

public class OtchestvoExeption extends CustomExeption {
    private final String otchestvo;

    public OtchestvoExeption(String message, String otchestvo) {
        super(message);
        this.otchestvo = otchestvo;
    }
}
