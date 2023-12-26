package dmdev.cinema.dao;

import dmdev.cinema.models.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
}
