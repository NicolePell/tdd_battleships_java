import java.util.ArrayList;
import java.util.List;

/**
 * Created by npellicenatredway on 28/01/2016.
 */
public class Player {

    private boolean board = true;
    private boolean trackingBoard = true;
    private List ships = new ArrayList<>();

    public boolean board() {
        return this.board;
    }

    public boolean trackingBoard() {
        return this.trackingBoard;
    }

    public List ships() {
        ships.add(new Ship(1));
        ships.add(new Ship(2));
        ships.add(new Ship(3));
        ships.add(new Ship(4));
        ships.add(new Ship(5));
        return ships;
    }
}
