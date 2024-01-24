package dmdev.cinema.models.response;

import dmdev.cinema.enums.SeatStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SeatScheduleResponse {
    long seatScheduleId;
    SeatStatus seatStatus;
    int row;
    int seatNum;
}
