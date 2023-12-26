package dmdev.cinema.dao;

import dmdev.cinema.models.entities.SeatSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatScheduleRepo extends JpaRepository<SeatSchedule, Long> {
}
