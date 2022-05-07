package grid;

public interface IGrid<T> {
    /**
     *
     * @return the number of rows in the grid.
     */
    int numRows();

    /**
     *
     * @return the number of cols in the grid.
     */
    int numCols();

    /**
     *
     * @param loc Location to be set.
     * @param value The value to be set at certain location.
     */
    void set(Location loc, T value);

    /**
     *
     * @param loc The location to check if exists on grid.
     * @return true if the location is on the grid, false otherwise.
     */
    boolean isOnGrid(Location loc);

    /**
     *
     * @param loc The location you want to get somthing from.
     * @return What's on the given location.
     */
    T get(Location loc);


}
