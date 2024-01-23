package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.RoomMoviePriceDto;
import dmdev.cinema.models.entities.RoomMoviePrice;
import org.mapstruct.Mapper;

@Mapper
public interface RoomMoviePriceMapper extends BaseMapper<RoomMoviePrice, RoomMoviePriceDto>{
}
