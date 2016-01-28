import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShipTest {

    private Ship ship;

    @Before
    public void setup() {
        ship = new Ship(1);
    }

    @Test
    public void testShipHasSize() {
        assertEquals(1, ship.getSize());
    }

    @Test
    public void testShipCanGetHit() {
        final Ship ship = new Ship(2);
        ship.hit();
        assertEquals(1, ship.getHitPoints());
    }

    @Test
    public void testShipHasZeroHitPointsWhenCreated(){
        assertEquals(0, ship.getHitPoints());
    }

    @Test
    public void testShipSinksWhenHitPointsEqualShipSize() {
        ship.hit();
        assertEquals(true, ship.isSunk());
    }

    @Test
    public void testShipIsNotSunkWhenCreated(){
        assertEquals(false, ship.isSunk());
    }

    @Test
    public void testShipIsPlacedOnBoard(){
        ship.placeOnBoard();
        assertEquals(true, ship.isOnBoard());
    }

    @Test
    public void testShipIsNotPlacedOnBoardWhenCreated() {
        assertEquals(false, ship.isOnBoard());
    }

}
