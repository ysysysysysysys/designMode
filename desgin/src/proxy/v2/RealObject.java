package proxy.v2;

public class RealObject implements Subject{

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
