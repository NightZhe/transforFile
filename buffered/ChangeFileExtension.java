import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChangeFileExtension {
    public static void main(String[] args) throws IOException {
        // 副檔名替換 txt -> Xml;
        // String path = "/Users/ben/Documents/buffered/buffer.txt";
        // int index = path.lastIndexOf("/");
        // String fileName = path.substring(index + 1);
        // System.out.println(fileName);
        // String newName = fileName.replaceAll(".txt", ".xml");
        // System.out.println(newName);

        String fileN = "/Users/ben/Documents/buffered";
        String newfile = "/Users/ben/Documents/buffered/testdemo";
        File file = new File(fileN);
        File file1 = new File(newfile);
        file1.mkdir();
        // file1.delete();
        String[] arr = file.list();
        for (String i : arr) {
            System.out.println(i);
        }

        String fileName1 = "/Users/ben/Documents/buffered/buffer.txt";
        read(fileName1);
    }

    public static void read(String fileName1) throws IOException {
        FileReader fr = new FileReader(fileName1);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            System.out.println(br.readLine());
        }
    }
}
