package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.RoomMovieDto;
import dmdev.cinema.models.entities.RoomMovie;
import org.mapstruct.Mapper;

@Mapper
public interface RoomMovieMapper extends BaseMapper<RoomMovie, RoomMovieDto>{
}
