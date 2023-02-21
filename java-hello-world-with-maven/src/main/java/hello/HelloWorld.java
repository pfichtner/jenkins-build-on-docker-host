package hello;

import java.time.LocalTime;

public class HelloWorld {

	private final Greeter greeter;

	public HelloWorld(Greeter greeter) {
		this.greeter = greeter;
	}

	public static void main(String[] args) {
		new HelloWorld(new HelloWorldGreeter()).doMain();
	}

	public void doMain() {
		System.out.println("The current time is " + LocalTime.now());
		System.out.println(greeter.sayHello());
	}

}
