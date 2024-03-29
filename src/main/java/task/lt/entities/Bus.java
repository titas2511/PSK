package task.lt.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Bus.findAll", query = "select a from Bus as a"),
        @NamedQuery(name = "Bus.findAllWithDrivers", query = "select distinct bus from Bus bus left join fetch bus.drivers")
})
@Table(name = "bus", schema = "public")
@Getter @Setter
public class Bus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Integer busId;

    @Size(max = 6)
    @NotBlank
    @Column(name = "plate_number", unique=true)
    private String plateNumber;

    @Column(name = "current_fuel")
    private Integer currentFuel;

    @OneToMany(mappedBy = "bus")
    private List<Trip> trips;

    @ManyToMany
    @JoinTable(name= "driver_bus",
            joinColumns = @JoinColumn(name = "bus_id"),
            inverseJoinColumns = @JoinColumn(name = "driver_id"))
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void removeDrive(Driver driver){
        drivers.remove(driver);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return plateNumber.equals(bus.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }
}
