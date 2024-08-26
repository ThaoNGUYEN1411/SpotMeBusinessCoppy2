package co.simplon.spotmebusiness2.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.spotmebusiness2.dtos.SpotCreate;
import co.simplon.spotmebusiness2.dtos.SpotView;
import co.simplon.spotmebusiness2.entities.Spot;
import co.simplon.spotmebusiness2.repositories.SpotRepository;

@Service
public class SpotService {

    public SpotRepository spots;

    public SpotService(SpotRepository spots) {
	this.spots = spots;
    }

    public void create(SpotCreate inputs) {
	Spot entity = new Spot();

	entity.setName(inputs.name());
	entity.setDescription(inputs.description());
	entity.setLat(inputs.lat());
	entity.setLng(inputs.lng());
	entity.setImageId(inputs.image());

	spots.save(entity);

    }

    public Collection<SpotView> getAll() {
	return spots.findAllProjectedBy();
    }

}
