package models;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager extends Staff {

    private int popularity;
    private Team team;

    public Manager(){}

    public Manager(String name, double salary, int popularity, Team team){
        super(name, salary);
        this.popularity = popularity;
        this.team = team;
    }

    @Column(name = "popularity")
    public int getPopularity(){
        return this.popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void managerPopularity(){
    }
}
