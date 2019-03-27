import debug.*;
//import debugoff.*;
public class Main {
    public static void main(String[] args) {
        //无法编译，冲突
        Debug d=new Debug();
    }
}
