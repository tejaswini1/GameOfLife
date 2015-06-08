
public class Cell {
    private String state;
    private int x;
    private int y;

    public Cell(int x, int y, String state){
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int getCellState(){
        if(state == "alive")
            return 1;
        return 0;
    }
}
