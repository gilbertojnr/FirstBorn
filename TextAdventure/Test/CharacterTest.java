import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gilbertakpan on 11/28/16.
 */
public class CharacterTest {
    @Test
    public void battle() throws Exception{
        Player player = new Player();
        player.name ="Test player";
        Enemy enemy = new Enemy("Test Enemy", 5, 5);
        player.battle(enemy);
        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);

    }
    @Test
    public void checkDamage() throws Exception{
        Player player = new Player();
        assertTrue(player.damage == 20);
    }

}