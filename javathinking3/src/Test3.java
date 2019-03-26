import java.util.concurrent.ConcurrentHashMap;

public class Test3 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            switch(i){
                case 0:System.out.println(i);break;
                case 1:System.out.println(i);break;
                case 2:System.out.println(i);break;
                case 3:System.out.println(i);break;
                case 4:System.out.println(i);break;
                default:System.out.println("停止");break;
           }
        }
    }
    ConcurrentHashMap c=new ConcurrentHashMap();
}
