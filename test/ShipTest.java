import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShipTest {

    @Test
    public void testShipHasSize() {
        final Ship ship = new Ship(1);
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
        final Ship ship = new Ship(1);
        assertEquals(0, ship.getHitPoints());
    }

    @Test
    public void testShipSinksWhenHitPointsEqualShipSize() {
        final Ship ship = new Ship(1);
        ship.hit();
        assertEquals(true, ship.isSunk());
    }

    @Test
    public void testShipIsNotSunkWhenCreated(){
        final Ship ship = new Ship(1);
        assertEquals(false, ship.isSunk());
    }

    @Test
    public void testShipIsPlacedOnBoard(){
        final Ship ship = new Ship(1);
        ship.placeOnBoard();
        assertEquals(true, ship.isOnBoard());
    }

    @Test
    public void testShipIsNotPlacedOnBoardWhenCreated() {
        final Ship ship = new Ship(1);
        assertEquals(false, ship.isOnBoard());
    }

}
