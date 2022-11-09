import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.homework.square.SQRService;

public class SQRServiceTest {

    @Test
    public void calcTest(){

        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQRt(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
