import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by npellicenatredway on 27/01/2016.
 */
public class PlayerTest {

    private Player player;

    @Before
    public void setup() {
        player = new Player();
    }

    @Test
    public void testPlayerHasHisOwnBoard() {
        assertThat(player.board(), is(true));
    }

    @Test
    public void testPlayerBoardIsAGrid() {
//        assertThat(player.board(), is(Class<Board>));
    }

    @Test
    public void testPlayerHasATrackingBoard() {
        assertThat(player.trackingBoard(), is(true));
    }

    @Test
    public void testPlayerHasFiveShips() {
        assertThat(player.ships().size(), is(5));
    }

    @Ignore
    public void testPlayerKnowsItsShipsAreHit() {
        List<Ship> ships = player.ships();
        Ship patrolboat = ships.get(0);
        assertThat(player.ships().contains(patrolboat), is(true));
    }

}
