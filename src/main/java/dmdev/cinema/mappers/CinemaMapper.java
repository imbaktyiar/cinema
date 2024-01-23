package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.CinemaDto;
import dmdev.cinema.models.entities.Cinema;
import org.mapstruct.Mapper;

@Mapper
public interface CinemaMapper extends BaseMapper<Cinema, CinemaDto>{
}
