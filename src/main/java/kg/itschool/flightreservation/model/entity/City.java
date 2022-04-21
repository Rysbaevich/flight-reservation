package kg.itschool.flightreservation.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@Table(name = "tb_cities")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City extends BaseEntity {

    @Column(name = "city_name", nullable = false)
    String cityName;

    @Column(name = "state", nullable = false)
    String state;

    @Column(name = "lat", nullable = false)
    BigDecimal lat;

    @Column(name = "lon", nullable = false)
    BigDecimal lon;

}
