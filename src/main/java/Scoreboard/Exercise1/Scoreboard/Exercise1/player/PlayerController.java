package Scoreboard.Exercise1.Scoreboard.Exercise1.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @RequestMapping("/players/{cat}")
    public List<Player> getPlayersByCat(@PathVariable("cat") String cat){
        return playerService.getPlayersByCat(cat);
    }
}
