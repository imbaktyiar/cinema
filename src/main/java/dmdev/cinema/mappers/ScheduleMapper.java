package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.ScheduleDto;
import dmdev.cinema.models.entities.Schedule;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule, ScheduleDto>{
}
