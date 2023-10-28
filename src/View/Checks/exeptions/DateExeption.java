package View.Checks.exeptions;

import java.time.LocalDate;

public class DateExeption extends CustomExeption{
    private LocalDate bornDate;

    public DateExeption(String message) {
        super(message);
    }

    public DateExeption(String message, LocalDate bornDate) {
        super(message);
        this.bornDate = bornDate;
    }
}
