package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.OrderDto;
import dmdev.cinema.models.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper extends BaseMapper<Order, OrderDto>{
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
}
