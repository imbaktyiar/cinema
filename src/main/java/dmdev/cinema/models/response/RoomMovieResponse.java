package dmdev.cinema.models.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomMovieResponse {
    Long roomMovieId;
    Double childPrice;
    Double standardPrice;
    LocalTime startTime;
}
