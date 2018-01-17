package Scoreboard.Exercise1.Scoreboard.Exercise1.player;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.*;
import org.apache.log4j.Logger;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    private final Logger logger = LogManager.getLogger(PlayerService.class);

    private Method method;

    public List<Player> getAllPlayers(){

        List<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        return players;
    }
//    Example: localhost:8080/players/catCookingXp
    public List<Player> getPlayersByCat(String cat){
        logger.info(" ");
        logger.info(">>>>>>>>> Sorting Scoreboard by Category: "+ cat+" <<<<<<<<<<<");
        logger.info(" ");

        List<Player> players = new ArrayList<>();
        playerRepository.findAll().forEach(players::add);
        Collections.sort(players,(Player a, Player b) -> b.getCatValue(cat).compareTo(a.getCatValue(cat)));
        return players;
    }

}
