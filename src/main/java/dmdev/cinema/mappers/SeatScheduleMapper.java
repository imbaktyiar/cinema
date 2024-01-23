package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.SeatScheduleDto;
import dmdev.cinema.models.entities.SeatSchedule;
import org.mapstruct.Mapper;

@Mapper
public interface SeatScheduleMapper extends BaseMapper<SeatSchedule, SeatScheduleDto>{
}
