package Exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @Test
    void testAddition() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
        assertThat(calculator.add(-1, 4)).isEqualTo(3);
    }

    @Test
    void testSubtraction() {
        assertThat(calculator.subtract(10, 5)).isEqualTo(5);
        assertThat(calculator.subtract(2, 7)).isEqualTo(-5);
    }

    @Test
    void testMultiplication() {
        assertThat(calculator.multiply(3, 4)).isEqualTo(12);
        assertThat(calculator.multiply(-2, 6)).isEqualTo(-12);
    }

    @Test
    void testDivision() {
        assertThat(calculator.divide(10, 2)).isEqualTo(5.0);
        assertThat(calculator.divide(9, 3)).isEqualTo(3.0);
    }

    @Test
    void testDivisionByZero() {
        assertThatThrownBy(() -> calculator.divide(10, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Cannot divide by zero");
    }
}
