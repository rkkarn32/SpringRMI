package org.RMIServer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ServerApplication 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
    	ISpringServer server = context.getBean("springServer", ISpringServer.class);
        System.out.println( "Server is Running !!!" );
    }
}
