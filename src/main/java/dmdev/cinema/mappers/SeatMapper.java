package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.SeatDto;
import dmdev.cinema.models.entities.Seat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SeatMapper extends BaseMapper<Seat, SeatDto>{
    SeatMapper INSTANCE = Mappers.getMapper(SeatMapper.class);
}
