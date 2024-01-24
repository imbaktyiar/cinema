package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.RoomMovieDto;
import dmdev.cinema.models.entities.RoomMovie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMovieMapper extends BaseMapper<RoomMovie, RoomMovieDto>{
    RoomMovieMapper INSTANCE = Mappers.getMapper(RoomMovieMapper.class);
}
