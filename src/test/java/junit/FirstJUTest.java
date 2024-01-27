package junit;

import org.junit.jupiter.api.*;

import java.lang.annotation.Target;

public class FirstJUTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("1");
    }

    @AfterEach
    void afterEach() {
        System.out.println("2");
    }

    @Test
    void firstTest() {
        System.out.println("test body");
        Assertions.assertTrue(3 > 2);
    }
}
