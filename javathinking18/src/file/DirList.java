package file;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DirList {
    private static List<File> fs=new ArrayList();
    public static void main(String[] args) {
        File path=new File(".");
        String[] dirList;
        if(args.length==0) {
            dirList = path.list();
            recurseDir(path,fs);
        }
        else {
            //带参数的list，传入一个FileNameFilter的实现类。
            dirList = path.list(new DirFilter(args[0]));
            recurseDir(path,fs);
        }
        System.out.println(dirList);
        for(String n: dirList){
            System.out.println(n);
        }
        System.out.println("-------------------------------------");

        for(File f: fs){
            System.out.println(f.getAbsolutePath());
        }
    }

    //递归遍历目录树
    static void recurseDir(File f,List fs){
        for(File file:f.listFiles()) {
            if (file.isDirectory()) {
                fs.add(f);
                recurseDir(file,fs);
            } else {
                fs.add(f);
            }
        }
        return;

    }
}
class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex){
        pattern=Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
        //比较正则表达式与name是否匹配
        return pattern.matcher(name).matches();
    }
}
