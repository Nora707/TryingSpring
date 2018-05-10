package SpaceShipCompany.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.time.LocalDate;

@Entity
public class SpaceShip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_ship;
    private String name;
    private LocalDate built;
    private int capacity_person;
    private int capacity_cargo;
    private int speed;

    public SpaceShip(String name, LocalDate built, int capacity_person, int capacity_cargo, int speed) {
        this.name = name;
        this.built = built;
        this.capacity_person = capacity_person;
        this.capacity_cargo = capacity_cargo;
        this.speed = speed;
    }

    public SpaceShip() {
    }

    public int getId_ship() {
        return id_ship;
    }

    public void setId_ship(int id_ship) {
        this.id_ship = id_ship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBuilt() {
        return built;
    }

    public void setBuilt(LocalDate built) {
        this.built = built;
    }

    public int getCapacity_person() {
        return capacity_person;
    }

    public void setCapacity_person(int capacity_person) {
        this.capacity_person = capacity_person;
    }

    public int getCapacity_cargo() {
        return capacity_cargo;
    }

    public void setCapacity_cargo(int capacity_cargo) {
        this.capacity_cargo = capacity_cargo;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
