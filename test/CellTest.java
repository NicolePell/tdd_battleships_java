import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CellTest {

    private Cell cell;

    @Before
    public void setup() {
        cell = new Cell();
    }


    @Test
    public void testCellKnowsItHasBeenShot() {
        cell.fire();
        assertThat(cell.isShot(), is(true));
    }

    @Test
    public void testCellIsNotShotWhenCreated() {
        assertThat(cell.isShot(), is(false));
    }

    @Test
    public void testCellKnowsIfItHasAShipOnIt() {
        cell.placeShip();
        assertThat(cell.isOccupied(), is(true));
    }

    @Test
    public void testCellIsEmptyWhenItIsCreated() {
        assertThat(cell.isOccupied(), is(false));
    }
}
