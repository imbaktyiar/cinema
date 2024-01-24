package dmdev.cinema.models.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaveOrderDetailRequest {
    Long seatScheduleId;
    Long orderId;
}
