package dmdev.cinema.models.entities;

import dmdev.cinema.enums.PriceType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_order_detail")
public class OrderDetail extends WorkDate{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    SeatSchedule seatSchedule;
    @ManyToOne
    Order order;
    @Enumerated(EnumType.STRING)
    PriceType priceType;

}
