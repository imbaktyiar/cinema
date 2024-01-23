package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.OrderDto;
import dmdev.cinema.models.entities.Order;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order, OrderDto>{
}
