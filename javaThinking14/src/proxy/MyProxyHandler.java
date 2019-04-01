package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxyHandler implements InvocationHandler {
    private Object proxied;
    public MyProxyHandler(Object proxied){
        this.proxied=proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I am the proxy of failure");
        method.invoke(proxied,args);
        return null;
    }
}
