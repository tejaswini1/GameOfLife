import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CellTest {

    @Test
    public void shouldReturnVisualRepresentationOfCell(){
        Cell cell = new Cell(0, 1);

        String actualDetails = cell.toString();

        assertThat(actualDetails, is(equalTo(("0,1"))));
    }



}
