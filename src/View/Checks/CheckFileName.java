package View.Checks;

import View.Checks.exeptions.FileNameExeption;

import java.io.File;

public class CheckFileName {
    public static String checkFileName(String fn) throws FileNameExeption {
        if (fn.isEmpty()){
            throw new FileNameExeption("Вы не указали имя файла!");
        }
        else{
            File file = new File(fn);
            if (!file.exists()){
                throw new FileNameExeption("Файла с таким именем не существует! " + fn);
            }
        }
        return fn;
    }
}
