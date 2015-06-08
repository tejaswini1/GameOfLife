import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CellTest {

    @Test
    public void shouldReturnVisualRepresentationOfCell(){
        Cell cell = new Cell(0, 0);

        String actualDetails = cell.toString();

        assertThat(actualDetails, is(equalTo(("0,0"))));
    }

    @Test
    public void shouldReturnFalseIfDimesionsPassedAndItsRepresentaionAreDifferent(){
        Cell cell = new Cell(0, 3);

        String actualDetails = cell.toString();

        assertThat(actualDetails, is(equalTo(("0,3"))));
    }

}
