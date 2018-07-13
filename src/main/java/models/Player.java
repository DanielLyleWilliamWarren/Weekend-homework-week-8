package models;

import javax.persistence.*;

@Entity
@Table
public class Player extends Staff {

    private String position;
    private Team team;

    public Player(){}

    public Player(String name, String position, double salary, Team team){
        super(name, salary);
        this.position = position;
        this.team = team;
    }

    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @ManyToOne
    @JoinColumn(name="team_id", nullable=false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
