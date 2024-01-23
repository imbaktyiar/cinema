package dmdev.cinema.dao;

import dmdev.cinema.models.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Long> {
    //code repo
}
