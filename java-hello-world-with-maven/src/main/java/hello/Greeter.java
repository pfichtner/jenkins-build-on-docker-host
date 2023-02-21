package hello;

public sealed interface Greeter permits HelloWorldGreeter {

	String sayHello();

}