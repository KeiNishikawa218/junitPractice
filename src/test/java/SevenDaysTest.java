import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SevenDaysTest {
    SevenDays sut;

    @BeforeEach
    public void beforeEach(){
        sut = new SevenDays();
    }

    @Test
    @DisplayName("月曜日")
    public void isMonday() {
        Boolean actual = sut.isSunday(2021, 6, 21);
        Boolean expected = false;
        assertThat(actual, is(expected));
    }

    @Test
    @DisplayName("日曜日")
    public void isSunday() {
        Boolean actual = sut.isSunday(2021, 6, 27);
        Boolean expected = true;
        assertThat(actual, is(expected));
    }
}
