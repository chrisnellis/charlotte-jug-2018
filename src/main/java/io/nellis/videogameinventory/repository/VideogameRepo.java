package io.nellis.videogameinventory.repository;

import io.nellis.videogameinventory.model.entity.VideogameEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideogameRepo extends CrudRepository<VideogameEntity, Integer> {
    List<VideogameEntity> findAll();
}
