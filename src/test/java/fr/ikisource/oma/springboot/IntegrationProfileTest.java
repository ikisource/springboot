package fr.ikisource.oma.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "integration")
public class IntegrationProfileTest {

    @Value("${town}")
    private String town;
    @Value("${java.home}")
    private String javaHome;

    @Test
    public void displayProperties() {

        System.out.println("town = " + town);
        Assertions.assertEquals("Rennes", town);

        System.out.println("javaHome = " + javaHome);
        Assertions.assertNotNull(javaHome);
    }

}
