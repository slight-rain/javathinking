package unitTest;

import org.junit.Assert;
import org.junit.Test;
//单元测试示例
public class UnitExample {
    public String methodOne(){
        return "hope";
    }
    public int methodTwo(){
        return 2;
    }
    @Test
    public void  methodOneTest(){
        Assert.assertEquals(methodOne(),"hope");
    }
    @Test
    public void methodTwoTest(){
        Assert.assertEquals(methodTwo(),2);
        System.out.println("all right");
    }
    @Test
    public void m2(){
        assert 1==2:"what a surprise!";
        return;
    }

}
