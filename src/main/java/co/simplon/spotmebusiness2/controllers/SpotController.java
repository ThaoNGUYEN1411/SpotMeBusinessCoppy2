package co.simplon.spotmebusiness2.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.spotmebusiness2.dtos.SpotCreate;
import co.simplon.spotmebusiness2.dtos.SpotView;
import co.simplon.spotmebusiness2.services.SpotService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/spots")
public class SpotController {
    public SpotService service;

    public SpotController(SpotService service) {
	this.service = service;
    }

    @PostMapping
    public void create(@Valid @ModelAttribute SpotCreate inputs) {
	service.create(inputs);
    }

    @GetMapping
    Collection<SpotView> getAll() {
	return service.getAll();
    }

}
