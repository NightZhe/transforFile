import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;

public class Replace {

    static String file = "/Users/ben/Documents/buffered/buffer.txt";
    static String tagetfile = "/Users/ben/Documents/buffered/repalce.txt";
    static String oldWord = "";
    static String newWord = "";

    public static void txtChangeWord(String file, String oldWord, String newWord) throws IOException {
        oldWord = ",";
        newWord = ">";

        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(tagetfile);

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        String line = null;

        while ((line = br.readLine()) != null) {

            String a = line.replace(oldWord, newWord);
            System.out.println(a);
            bw.write(a);
            bw.flush();
            bw.newLine();

        }
        bw.close();
    }

    /**
     * @param infile         //文件
     * @param LineNo         //指定謀行
     * @param LineToBeInsert //加入你要的文字內容
     * @throws IOException
     */
    public void insertStringInFile(File infile, int LineNo, String LineToBeInsert) throws IOException {
        File outfile = File.createTempFile("name", ".tmp");
        // 輸入
        FileInputStream fis = new FileInputStream(infile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        // 輸出
        FileOutputStream fos = new FileOutputStream(outfile);
        PrintWriter out = new PrintWriter(fos);
        // 保存一行數據
        String thisLine;
        String countLine;
        // 行號從1開始
        int i = 1;
        // int max = 0;
        // while ((countLine = br.readLine()) != null) {
        // out.println(countLine);
        // max++;
        // }
        // System.out.println(max);

        while ((thisLine = br.readLine()) != null) {
            if (i == LineNo) {
                out.println(LineToBeInsert);
            }
            out.println(thisLine);
            i++;
        }
        System.out.println(i);
        if ((i - 1) < LineNo) {
            out.println(LineToBeInsert);
        }
        out.flush();
        out.close();
        br.close();

        infile.delete();
        outfile.renameTo(infile);

    }

    public static void main(String[] args) throws IOException {
        // txtChangeWord(file, oldWord, newWord);
        Replace rp = new Replace();
        File infile = new File("/Users/ben/Documents/buffered/buffer.txt");
        rp.insertStringInFile(infile, 19, "this is 6 line");

    }

}
