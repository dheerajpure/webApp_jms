package jmsexample;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//https://www.javatpoint.com/spring-and-jms-integration
//https://www.javatpoint.com/spring-and-jms-integration

@Component
public class ExampleListener {

	@JmsListener(destination = "queue_01")
	public void onMessage(Message m) {
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("Received message " + m);
	}

}
