package dmdev.cinema.dao;

import dmdev.cinema.models.entities.RoomMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomMovieRepo extends JpaRepository<RoomMovie,Long> {
}
