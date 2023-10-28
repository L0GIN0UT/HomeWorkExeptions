package View.Checks;

import View.Checks.exeptions.FileNameDownloadExeption;

import java.io.File;

public class CheckFileDownloadName {
    public static String checkFileName(String fn) throws FileNameDownloadExeption {
        if (fn.isEmpty()){
            throw new FileNameDownloadExeption("Вы не указали имя файла!");
        }
        else{
            File file = new File(fn);
            if (!file.exists()){
                throw new FileNameDownloadExeption("Файла с таким именем не существует! " + fn);
            }
        }
        return fn;
    }
}
