package dmdev.cinema.models.dto;

import dmdev.cinema.enums.PriceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailDto extends WorkDateDto{
    Long id;
    SeatScheduleDto seatSchedule;
    OrderDto order;
    PriceType priceType;
}
