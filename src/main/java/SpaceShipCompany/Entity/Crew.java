package SpaceShipCompany.Entity;

import SpaceShipCompany.commons.Rank;

import javax.persistence.*;

@Entity
public class Crew {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_pilot;
    @Column
    private String crewName;
    @Column
    private int crewRank;
    @Column
    private String photo;

    public Crew(String name, int rank, String photo) {
        this.crewName = name;
        this.crewRank = rank;
        this.photo = photo;
    }

    public Crew(){}

    public Integer getId_pilot() {
        return id_pilot;
    }


    public String getName() {
        return crewName;
    }

    public void setName(String name) {
        this.crewName = name;
    }

    public int getRank() {
        return crewRank;
    }

    public void setRank(String rank){
        setRank(Rank.valueOf(rank).getCode());
    }
    public void setRank(int rank) {
        this.crewRank = rank;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
