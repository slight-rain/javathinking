package output;

import input.BufferedInputFile;

import java.io.*;

public class BasicFileOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new StringReader(BufferedInputFile.read("./src/input/BufferedInputFile.java")));
        PrintWriter pw=new PrintWriter(new FileWriter("test.output"));
        //行数；
        int line=1;
        String s;
        while((s=br.readLine())!=null){
            pw.println(line++ +":"+s);
        }
        pw.close();
        System.out.println(BufferedInputFile.read("test.output"));
    }
}
