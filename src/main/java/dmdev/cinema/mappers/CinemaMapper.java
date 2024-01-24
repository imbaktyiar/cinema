package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.CinemaDto;
import dmdev.cinema.models.entities.Cinema;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CinemaMapper extends BaseMapper<Cinema, CinemaDto>{
    CinemaMapper INSTANCE = Mappers.getMapper(CinemaMapper.class);
}
