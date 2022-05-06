package grid;

public interface IGrid<T> {
    /**
     *
     * @return the amount of rows in the grid.
     */
    int getRows();

    /**
     *
     * @return the amount of cols in the grid.
     */
    int getCols();

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


}
