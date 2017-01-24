package hello;

//import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    //@Autowired
    Greeter greeter = new Greeter();

    public String helloWorld() {
        return greeter.sayHello();
    }
}
