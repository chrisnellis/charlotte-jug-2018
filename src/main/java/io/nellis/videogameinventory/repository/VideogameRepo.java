package io.nellis.videogameinventory.repository;

import io.nellis.videogameinventory.model.entity.VideogameEntity;
import org.springframework.data.repository.CrudRepository;

public interface VideogameRepo extends CrudRepository<VideogameEntity, Integer> {
}
