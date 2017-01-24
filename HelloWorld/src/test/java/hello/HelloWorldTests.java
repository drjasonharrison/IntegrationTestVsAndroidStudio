package hello;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTests {

    HelloWorld helloWorld;

    @Before
    public void setup() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void shouldSayHelloWorld() {
        String s = helloWorld.helloWorld();
        Assert.assertThat(s, CoreMatchers.containsString("Hello world!"));
    }
}
