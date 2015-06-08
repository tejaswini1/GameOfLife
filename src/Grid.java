import java.util.HashMap;
import java.util.HashSet;

public class Grid {
    private HashSet<Cell> aliveCells = new HashSet<Cell>();

    public Grid(){
        aliveCells.add(new Cell(2,3));
        aliveCells.add(new Cell(4,5));
        aliveCells.add(new Cell(7,8));
    }
}
