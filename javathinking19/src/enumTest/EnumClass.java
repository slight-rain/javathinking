package enumTest;

public class EnumClass {
    public static void main(String[] args) {
        //输出enum的全部值
        Color[] cs=Color.values();
        for(Color color:cs){
            System.out.println(color);
        }
        Color c=Color.YELLOW;
        Color c1=Color.RED;

        System.out.println(c.c+"=============="+c1.c);

    }
}

enum Color{ YELLOW,RED,BLUE,GREEN,PURPLE;//是Color的实例
public int c=0;
Color(){
    c++;
}
}
