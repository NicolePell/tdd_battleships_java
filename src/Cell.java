public class Cell {

    private boolean isShot = false;
    private boolean isOccupied = false;

    public void fire() {
        this.isShot = true;
    }

    public boolean isShot() {
        return isShot;
    }

    public void placeShip() {
        this.isOccupied = true;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
