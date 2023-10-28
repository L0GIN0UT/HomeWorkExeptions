package View;

import View.Checks.exeptions.*;

public interface View {
    void start() throws FamiliaExeption, OtchestvoExeption, DateExeption, NameExeption, PhoneNumberExeption, ConsoleExeption, GenderExeption, FileNameExeption, FileNameUploadExeption;
    void printAnswer(String answer);
}
