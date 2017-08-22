package example;

import net.thinkmar.HelloWorld;
import net.thinkmar.HelloWorldService;

/**
 * JAX-WS方式生成的客户端测试类
 */
public class HelloWorldClient {
    public static void main(String[] argv) {
        HelloWorld service = new HelloWorldService().getHelloWorldPort();
        String returnStr = service.sayHelloWorldFrom("客户端传递参数");
        System.out.println(returnStr);
    }
}
