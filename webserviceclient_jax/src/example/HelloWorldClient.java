package example;

import net.thinkmar.HelloWorld;
import net.thinkmar.HelloWorldService;

/**
 * JAX-WS��ʽ���ɵĿͻ��˲�����
 */
public class HelloWorldClient {
    public static void main(String[] argv) {
        HelloWorld service = new HelloWorldService().getHelloWorldPort();
        String returnStr = service.sayHelloWorldFrom("�ͻ��˴��ݲ���");
        System.out.println(returnStr);
    }
}
