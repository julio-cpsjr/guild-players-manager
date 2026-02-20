package br.com.guilda.service;


import br.com.guilda.model.Guilda;
import br.com.guilda.repository.GuildaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuildaService {

    private final GuildaRepository repository;

    public GuildaService(GuildaRepository repository) {
        this.repository = repository;
    }

    public Guilda save(Guilda guilda) {
        return repository.save(guilda);
    }

    public List<Guilda> ListGuilda() {
        return repository.findAll();
    }

    public Guilda findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Guilda update(Long id, Guilda guilda) {
        guilda = repository.findById(id).orElseThrow(()-> new RuntimeException("Guilda não encontrada"));
        guilda.setName(guilda.getName());
        guilda.setDescription(guilda.getDescription());
        return repository.save(guilda);
    }

}
