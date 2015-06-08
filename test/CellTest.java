import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CellTest {

    @Test
    public void shouldReturnOneIfCellIsAlive(){
        Cell cell = new Cell(0, 1, "alive");

        int actualDetails = cell.getCellState();

        assertThat(actualDetails, is(equalTo((1))));
    }

    @Test
    public void shouldReturnZeroIfCellIsNotAlive(){
        Cell cell = new Cell(0, 1, "dead");

        int actualDetails = cell.getCellState();

        assertThat(actualDetails, is(equalTo((0))));
    }

}
