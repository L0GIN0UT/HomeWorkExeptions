package View.Checks;

import View.Checks.exeptions.FileNameUploadExeption;

import java.io.File;

public class CheckFileNameUpload {

    public static String checkFileName(String fn) throws FileNameUploadExeption {
        if (fn.isEmpty()){
            throw new FileNameUploadExeption("Вы не указали имя файла!");
        }
        return fn;
    }
}
