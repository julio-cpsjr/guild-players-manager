package br.com.guilda.service;

import br.com.guilda.model.Player;
import br.com.guilda.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }
    public Player save(Player player) {
        return repository.save(player);
    }

    public List<Player> ListPlayers() {
        return repository.findAll();
    }

    public Player findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Player update(Long id, Player player) {
        player = repository.findById(id).orElseThrow(()-> new RuntimeException("Guilda não encontrada"));
        player.setName(player.getName());
        player.setGuilda(player.getGuilda());
        player.setNivel(player.getNivel());
        player.setStatus(player.getStatus());
        return repository.save(player);
    }


}
