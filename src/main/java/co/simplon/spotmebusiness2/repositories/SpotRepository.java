package co.simplon.spotmebusiness2.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.spotmebusiness2.dtos.SpotView;
import co.simplon.spotmebusiness2.entities.Spot;

@Repository
public interface SpotRepository extends JpaRepository<Spot, Long> {

    Collection<SpotView> findAllProjectedBy();

}
