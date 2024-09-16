import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();

    @Test
    public void addMeTest() {
        assertEquals(5, app.addMe(2, 3));
    }

    @Test
    public void subMeTest() {
        assertEquals(1, app.subMe(3, 2));
    }

}