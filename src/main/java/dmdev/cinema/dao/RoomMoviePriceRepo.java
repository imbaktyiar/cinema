package dmdev.cinema.dao;

import dmdev.cinema.models.entities.RoomMoviePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomMoviePriceRepo extends JpaRepository<RoomMoviePrice, Long> {
}
