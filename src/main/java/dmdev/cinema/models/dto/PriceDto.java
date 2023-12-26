package dmdev.cinema.models.dto;

import dmdev.cinema.enums.PriceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto extends WorkDateDto{Long id;
    Double price;
    PriceType priceType;
}
