import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class bfw {

    public static void main(String[] args) throws IOException {

        // 單純讀取檔案
        // FileReader fr = new FileReader("/Users/ben/Documents/buffered/buffer.txt");
        // try (BufferedReader br = new BufferedReader(fr)) {
        // while (br.ready()) {
        // System.out.println(br.readLine());
        // }
        // }

        FileReader fr1 = new FileReader("/Users/ben/Documents/tranforFile/buffered/buffer.txt");
        FileWriter fw1 = new FileWriter("/Users/ben/Documents/tranforFile/buffered/copy.txt");

        BufferedReader br1 = new BufferedReader(fr1);
        BufferedWriter bw1 = new BufferedWriter(fw1);

        // String line = null;
        // while ((line = br1.readLine()) != null) {
        // bw1.write(line);
        // bw1.newLine();
        // bw1.flush();
        // }

        int ch = 0;
        while ((ch = br1.read()) != -1) {
            bw1.write(ch);

            bw1.flush();
        }

    }
}
