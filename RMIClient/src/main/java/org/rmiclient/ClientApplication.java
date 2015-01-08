package org.rmiclient;

import org.RMIServer.ISpringServer;
import org.RMIServer.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class ClientApplication 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        ISpringServer server = context.getBean("helloServer", ISpringServer.class);
        Person p = new Person("Jantu", "22"); 
        String retMessage = server.sayHello(p);
        System.out.println("Incoming: "+retMessage);
    }
}
