package com.example.cw2.service;

import com.example.cw2.model.durgaprasadPlayer;
import com.example.cw2.repository.durgaprasadPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class durgaprasadPlayerService {

    @Autowired
    private durgaprasadPlayerRepo playerRepo;

    public List<durgaprasadPlayer> getAllPlayers() {
        return playerRepo.findAll();
    }

    public durgaprasadPlayer getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    public durgaprasadPlayer addPlayer(durgaprasadPlayer player) {
        return playerRepo.save(player);
    }
}
