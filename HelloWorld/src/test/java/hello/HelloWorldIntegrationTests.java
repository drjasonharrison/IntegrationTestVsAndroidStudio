package hello;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

@RunWith(SpringRunner.class)
@ContextConfiguration //("file:HellowWorldTests-context.xml") // integration tests
@SpringBootTest
public class HelloWorldIntegrationTests {

    @Autowired
    HelloWorld helloWorld;

    @Test
    public void shouldSayHelloWorld() {
        String s = helloWorld.helloWorld();
        Assert.assertThat(s, CoreMatchers.containsString("Hello world!"));
    }
}
