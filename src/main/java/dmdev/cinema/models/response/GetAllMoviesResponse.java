package dmdev.cinema.models.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.lang.management.LockInfo;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetAllMoviesResponse {
    Long id;
    String name;
    String imageLink;
    String pg;
    Double rating;
}
