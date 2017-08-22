/**
 * HelloWorldServiceTestCase.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.thinkmar;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;
import java.net.URL;

/**
 * Apache Axis方式生成的客户端代码
 * 根据http://localhost:8080/services/HelloWorld?wsdl生成的客户端
 * 代码包路径可以任意
 */
public class HelloWorldServiceTestCase extends TestCase {
    public HelloWorldServiceTestCase(String name) {
        super(name);
    }

    public void testHelloWorldPortWSDL() throws Exception {
        ServiceFactory serviceFactory = ServiceFactory.newInstance();
        URL url = new URL(new HelloWorldServiceLocator().getHelloWorldPortAddress() + "?WSDL");
        Service service = serviceFactory.createService(url, new HelloWorldServiceLocator().getServiceName());
        assertTrue(service != null);
        HelloWorld helloWorld = (HelloWorld) service.getPort(HelloWorld.class);
        String value = helloWorld.sayHelloWorldFrom("客户端传递参数");
        System.out.println("客户端调用服务端方法后结果：" + value);
    }

    public void test1HelloWorldPortSayHelloWorldFrom() throws Exception {
        HelloWorldPortBindingStub binding;
        try {
            binding = (HelloWorldPortBindingStub)
                    new HelloWorldServiceLocator().getHelloWorldPort();
        } catch (ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);
        binding.setTimeout(60000);

        String value = "客户端传递参数";
        value = binding.sayHelloWorldFrom(value);
        System.out.println("客户端调用服务端方法后结果：" + value);
    }

}
