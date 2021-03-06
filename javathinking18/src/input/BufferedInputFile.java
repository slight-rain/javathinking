package input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedInputFile {
    public static String read(String fileName){
        StringBuffer sb=new StringBuffer();
        try {
            FileReader fr=new FileReader(fileName);
            BufferedReader br=new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null){
                sb.append(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(read("./src/input/BufferedInputFile.java"));
    }
}
