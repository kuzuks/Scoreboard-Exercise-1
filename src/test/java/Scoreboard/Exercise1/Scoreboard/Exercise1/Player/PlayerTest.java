package Scoreboard.Exercise1.Scoreboard.Exercise1.Player;

import Scoreboard.Exercise1.Scoreboard.Exercise1.player.Player;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
public class PlayerTest {

    @Autowired
    private PlayerTest player;

    @Test
    public void testGetByCatService(){
        Player playerInstance = new Player(1,"Player Test", 19, 20,312,1312,3123,12312,222);

        assertEquals(12312, playerInstance.getCatValue("catCookingXp"),12312);
        assertEquals(20, playerInstance.getCatValue("overallXp"),20);
        assertEquals(3123, playerInstance.getCatValue("catMagicXp"),3123);
    }
}
