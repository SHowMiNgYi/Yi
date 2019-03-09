package Day10;

public class FinalDemo3 {
}

class FD2{
    //final可以重载，方法名一样，参数列表不一致
    public final void m(){}
    public final void m(int n){}
}

class FD3 extends FD2{
    //final不能重写，两个方法中方法签名一致
    //public final void m(){}
}
