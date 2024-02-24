package fr.ikisource.oma.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = {"test", "integration"})
public class TestAndIntegrationProfilesTest {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${adult}")
    private Boolean adult;

    @Value("${town}")
    private String town;
    @Value("${java.home}")
    private String javaHome;

    @Test
    public void displayProperties() {

        System.out.println("name = " + name);
        Assertions.assertEquals("Olivier", name);
        System.out.println("age = " + age);
        Assertions.assertEquals(31, age);
        System.out.println("adult = " + adult);
        Assertions.assertTrue(adult);

        System.out.println("town = " + town);
        Assertions.assertEquals("Rennes", town);
        System.out.println("javaHome = " + javaHome);
        Assertions.assertNotNull(javaHome);
    }

}
