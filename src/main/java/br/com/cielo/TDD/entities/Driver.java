package br.com.cielo.TDD.entities;

import br.com.cielo.TDD.entities.enums.GenderType;
import br.com.cielo.TDD.entities.enums.VehicleType;
import br.com.cielo.TDD.entities.enums.WashingType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "DRIVER")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Driver {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "NAME", nullable = false)
    private String name;

    @Basic
    @Enumerated
    @Column(name = "GENDER", nullable = false)
    private GenderType gender;

    @Basic
    @Column(name = "HAS_OWN_VEHICLE")
    private boolean hasOwnVehicle;

    @Basic
    @Enumerated
    @Column(name = "WASHING_TYPE", nullable = false)
    private WashingType washingType;

    @Basic
    @Enumerated
    @Column(name = "VEHICLE_TYPE", nullable = false)
    private VehicleType vehicleType;

    @Basic
    @Column(name = "WASHING_DATE")
    private Timestamp washingDate;

    @Basic
    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @Basic
    @Column(name = "IS_UBER")
    private boolean isUber;
}
