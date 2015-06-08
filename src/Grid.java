import java.util.LinkedList;

public class Grid {
    private LinkedList<Cell> aliveCells = new LinkedList<Cell>();

    public Grid() {
        aliveCells.add(new Cell(2, 3));
        aliveCells.add(new Cell(4, 5));
        aliveCells.add(new Cell(7, 8));
    }

    @Override
    public String toString() {
        String output = "";
        for (Cell cell : aliveCells)
            output += cell.toString()+ " ";
        return output;
    }

}
