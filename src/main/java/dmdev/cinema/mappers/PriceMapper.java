package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.PriceDto;
import dmdev.cinema.models.entities.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper extends BaseMapper<Price, PriceDto>{
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
}
