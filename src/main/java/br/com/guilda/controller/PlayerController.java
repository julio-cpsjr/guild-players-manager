package br.com.guilda.controller;

import br.com.guilda.model.Player;
import br.com.guilda.service.PlayerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @Tag(name = "Player", description = "Sword Art Online")
    @RestController
    @RequestMapping("/players")
    public class PlayerController {

        private final PlayerService service;

        public PlayerController(PlayerService service) {
            this.service = service;
        }

        @PostMapping
        public Player save(@RequestBody Player player) {
            return service.save(player);
        }

        @GetMapping
        public List<Player> findAll() {
            return service.ListPlayers();
        }

        @GetMapping("/{id}")
        public Player findById(@PathVariable Long id) {
            return service.findById(id);
        }

        @DeleteMapping
        public void deleteById(@RequestParam Long id) {
            service.delete(id);
        }

        @PutMapping("/{id}")
        public Player update(@PathVariable Long id, @RequestBody Player player) {
            return service.update(id, player);
    }
}
