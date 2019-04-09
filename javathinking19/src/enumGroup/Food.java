package enumGroup;

public interface Food{
    //通过接口将enum分组
    enum Meet implements Food{
        PIG,TIGER,DOG,CHICKEN
    }
    enum Vagetable implements Food{
        TOMATO,POTATO
    }
}
