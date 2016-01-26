
public class Ship {

    private int size;
    private int hitPoints = 0;
    private boolean onBoard = false;

    public Ship(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void hit() {
        hitPoints ++;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isSunk() {
        if (hitPoints == getSize()) {
            return true;
        }

        return false;
    }

    public void placeOnBoard() {
        onBoard = true;
    }

    public boolean isOnBoard() {
       return onBoard;
    }

}
