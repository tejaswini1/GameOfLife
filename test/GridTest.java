import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GridTest {
    @Test
    public void shouldReturnDimensionsOfAllAliveCells() {
        Grid grid = new Grid();

        String actual = grid.toString();

        assertThat(actual, is(equalTo("2,3 4,5 7,8 ")));

    }


}
