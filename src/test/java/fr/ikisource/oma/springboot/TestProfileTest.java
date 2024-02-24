package fr.ikisource.oma.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "test")
public class TestProfileTest {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${adult}")
    private Boolean adult;

    @Test
    public void displayProperties() {

        System.out.println("name = " + name);
        Assertions.assertEquals("Olivier", name);
        System.out.println("age = " + age);
        Assertions.assertEquals(31, age);
        System.out.println("adult = " + adult);
        Assertions.assertTrue(adult);
    }

}
