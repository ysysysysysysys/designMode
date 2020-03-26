package proxy.v2;

public class Proxy implements Subject{
    private RealObject realObject;

    public Proxy() {
        this.realObject = new RealObject();
    }

    @Override
    public void request() {
        System.out.println("调用真实开始");
        realObject.request();
        System.out.println("调用真实结束");
    }
}
