package grid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Grid<T> implements IGrid<T>{
    private final int rows;
    private final int cols;

    private ArrayList<ArrayList<T>> grid;

    public Grid(int rows, int cols, T value) {
        this.cols = cols;
        this.rows = rows;
        this.grid = new ArrayList<ArrayList<T>> (cols);
       fill(grid, rows, cols, value);
    }

    public Grid(int rows, int cols){
        this.cols = cols;
        this.rows = rows;
        grid = new ArrayList<ArrayList<T>>();
        fill(grid, rows, cols, null);
    }


    public int numRows() {
        return rows;
    }

    public int numCols() {
        return cols;
    }

    public void set(Location loc, T value) {
        this.grid.get(loc.getCol()).set(loc.getRow(), value);

    }

    public boolean isOnGrid(Location loc) {
        return loc.getCol() < cols && loc.getCol() > 0 &&
                loc.getRow() < rows && loc.getRow() > 0;
    }

    @Override
    public T get(Location loc) {
        return grid.get(loc.getCol()).get(loc.getRow());
    }

    private void fill(ArrayList<ArrayList<T>> toFill, int rows, int cols, T value){
        for(int y= 0; y < cols; y++){
            ArrayList<T> rowList = new ArrayList<T>(rows);
            for(int x = 0; x < rows; x++){
                rowList.add(value);
            }
            toFill.add(rowList);
        }
    }
}
