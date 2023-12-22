package dmdev.cinema.models.entities;

import dmdev.cinema.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_seat_schedule")
public class SeatSchedule extends WorkDate{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Seat seat;
    @ManyToOne
    RoomMovie roomMovie;
    @Enumerated(EnumType.STRING)
    SeatStatus seatStatus;
}
