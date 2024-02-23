package fr.ikisource.oma.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ConfigTest {

    @Value("${name}")
    private String name;

    @Value("${xdg.current.desktop}")
    private String xdgCurrentDesktop;

    @Test
    public void config() {

        System.out.println("name = " + name);
        Assertions.assertNotNull(name);
        System.out.println("xdgCurrentDesktop = " + xdgCurrentDesktop);
        Assertions.assertNotNull(xdgCurrentDesktop);
    }

}
