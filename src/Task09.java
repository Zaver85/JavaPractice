//Напишите метод, который вернет содержимое текущей папки в виде
//массива строк.
//        Напишите метод, который запишет массив, возвращенный предыдущим
//методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае
//        возникновения исключения, оно должно записаться в лог-файл.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task09 {
    public static void main(String[] args) {
        String[] contentFolder = getFileList(System.getProperty("user.dir"));
        writeArrayToFile(contentFolder);

    }

    static String[] getFileList(String folderName) {
        File currentFolder = new File(folderName);
        return currentFolder.list();
    }

    static  void writeArrayToFile(String[] arr) {
        try (FileWriter fr = new FileWriter("fileList.txt")) {
            for ( String elem : arr) {
                fr.write(elem);
                fr.write("\n");
                }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
