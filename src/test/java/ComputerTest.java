import com.bodick.Computer;
import com.bodick.Main;
import com.bodick.MissingBracketException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    private static Computer computer;

    @BeforeAll
    static void init() {
        computer = new Computer();
    }

    @Test
    void add() {
        assertEquals(349, computer.compute("19 + 325 + 5"));
    }

    @Test
    void multipleOperations() {
        assertEquals(52, computer.compute("7 * 8 / 4 + 51 - 13"));
    }

    @Test
    void priority() {
        assertEquals(6, computer.compute("2 + 2 * 2"));
    }

    @Test
    void zeroSpaces() {
        assertEquals(-91, computer.compute("15/3*4-117+6"));
    }

    @Test
    void brackets() {
        assertEquals(8, computer.compute("(2 + 2) * 2"));
    }

    @Test
    void realNumbers() {
        assertEquals(0, computer.compute("5 - 1.25 * 4"));
    }

    @Test
    void realResult() {
        assertEquals(4.25, computer.compute("17 / 4"));
    }

    @Test
    void missingOpeningBracket() {
        assertThrows(MissingBracketException.class, () -> computer.compute("3 * (12 - 7) / 5)"));
    }

    @Test
    void missingClosingBracket() {
        assertThrows(MissingBracketException.class, () -> computer.compute("3 * ((12 - 7) / 5"));
    }
}
