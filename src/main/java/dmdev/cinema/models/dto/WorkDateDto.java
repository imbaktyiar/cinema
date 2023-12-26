package dmdev.cinema.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkDateDto {
    @JsonIgnore
    LocalDateTime addDate;
    @JsonIgnore
    LocalDateTime updateDate;
    @JsonIgnore
    boolean active;
}
