package br.com.guilda.controller;


import br.com.guilda.model.Guilda;
import br.com.guilda.model.Player;
import br.com.guilda.service.GuildaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Guilda", description = "Knights of the blood - Sword Art Online")
@RestController
@RequestMapping("/guilds")
public class GuildaController {
    private final GuildaService service;

    public GuildaController(GuildaService service) {
        this.service = service;
    }

    @PostMapping
    public Guilda save(@RequestBody Guilda guilda) {
        return service.save(guilda);
    }

    @GetMapping
    public List<Guilda> findAll() {
        return service.ListGuilda();
    }

    @GetMapping("/{id}")
    public Guilda findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Guilda update(@PathVariable Long id, @RequestBody Guilda guilda) {
        return service.update(id, guilda);
    }
}
