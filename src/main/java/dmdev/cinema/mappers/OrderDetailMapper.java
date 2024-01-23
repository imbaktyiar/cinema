package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.OrderDetailDto;
import dmdev.cinema.models.entities.OrderDetail;
import org.mapstruct.Mapper;

@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail, OrderDetailDto>{
}
