import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Example {

    @BeforeEach
    void beforeEach(){
        // open("google.com");
        System.out.println("!!!beforeEach!!!");
    }

    @Test
    void firstTest() {
        System.out.println("!!!firstTest!!!");
        assertTrue(3 > 2);
    }

    @Test
    void secondTest() {
        System.out.println("!!!secondTest!!!");
        assertFalse(3 > 2);
    }
}
