import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: Randoms")
public class RandomsTest {
    private Randoms randoms = new Randoms(0, 0);

    @Test
    @DisplayName("Тестирование метода выбора случайного значения")
    void rnd() {
        int actual = randoms.rnd(5, 75);
        Assertions.assertTrue(actual <= 75 && actual >= 5);
    }
}
