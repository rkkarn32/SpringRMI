package org.RMIServer;

import org.springframework.stereotype.Component;

@Component
public class SpringServer implements ISpringServer {

	public String sayHello(Person person) {
		System.out.println("Name: "+person.getName()+", Age: "+person.getAge());
		return "Welcome "+person.getName();
		
	}
}
