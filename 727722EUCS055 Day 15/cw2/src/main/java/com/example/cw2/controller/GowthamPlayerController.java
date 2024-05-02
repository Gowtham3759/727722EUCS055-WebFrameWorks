
package com.example.cw2.controller;

import com.example.cw2.model.GowthamPlayer;
import com.example.cw2.service.GowthamPlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/players")
public class GowthamPlayerController {

    private static final Logger logger = LoggerFactory.getLogger(GowthamPlayerController.class);

    @Autowired
    private GowthamPlayerService playerService;

    @GetMapping
    public ResponseEntity<List<GowthamPlayer>> getAllPlayers() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/players; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of players", "N/A");
        List<GowthamPlayer> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GowthamPlayer> getPlayerById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/players/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Player details", "N/A");
        GowthamPlayer player = playerService.getPlayerById(id);
        return ResponseEntity.ok(player);
    }

    @PostMapping
    public ResponseEntity<GowthamPlayer> addPlayer(@RequestBody GowthamPlayer player) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/players; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                player, HttpStatus.CREATED.value(), "Player added successfully", "N/A");
        GowthamPlayer savedPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }
}