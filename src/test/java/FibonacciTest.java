import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test
    void testFirstTen() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Fibonacci.generate(10));
    }

    @Test
    void testEmptyAndSingle() {
        assertArrayEquals(new int[]{}, Fibonacci.generate(0));
        assertArrayEquals(new int[]{0}, Fibonacci.generate(1));
    }

    @Test
    void testNegativeCount() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.generate(-1));
    }
}
