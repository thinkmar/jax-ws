package thinkmar;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWorld {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "客户端传递到服务端参数为[" + from + "].";
        System.out.println(result);
        return result;
    }

    public static void main(String[] argv) {
        Object implementor = new HelloWorld();
        String address = "http://localhost:9000/HelloWorld";
        Endpoint.publish(address, implementor);
    }
}
