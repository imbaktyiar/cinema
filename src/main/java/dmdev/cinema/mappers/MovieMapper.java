package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.MovieDto;
import dmdev.cinema.models.entities.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieMapper extends BaseMapper<Movie, MovieDto>{
    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);
}
