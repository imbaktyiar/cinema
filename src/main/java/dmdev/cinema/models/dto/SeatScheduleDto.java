package dmdev.cinema.models.dto;

import dmdev.cinema.enums.SeatStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class SeatScheduleDto extends WorkDateDto{
    Long id;
    SeatDto seat;
    RoomMovieDto roomMovie;
    SeatStatus seatStatus;
}
