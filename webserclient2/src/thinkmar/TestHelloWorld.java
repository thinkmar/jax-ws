package thinkmar;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * 说明：
 * 调用JAX-WS服务端时，客户端使用URL方式，在接口类上需要增加@WebService标注；路径需要与服务器端一致
 */
public class TestHelloWorld {

    public static void main(String[] args) {
        try {
            //创建访问WSDL服务地址的URL
            URL url = new URL("http://localhost:8080/services/HelloWorld?wsdl");
            //通过QName指明服务的具体信息(<MyServiceImplService xmlns="http://service.zttc.org/">)
            QName sname = new QName("http://thinkmar/", "HelloWorldService");
            //创建服务
            Service service = Service.create(url, sname);
            //实现接口
            HelloWorld helloWorld = service.getPort(HelloWorld.class);
            System.out.println("客户端调用服务端方法后结果：" + helloWorld.sayHelloWorldFrom("客户端传递参数"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
