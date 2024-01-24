package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.SeatScheduleDto;
import dmdev.cinema.models.entities.SeatSchedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SeatScheduleMapper extends BaseMapper<SeatSchedule, SeatScheduleDto>{
    SeatScheduleMapper INSTANCE = Mappers.getMapper(SeatScheduleMapper.class);
}
