package models;

import javax.persistence.*;

@Entity
@Table
public class Player extends Staff {

    private Position position;
    private Team team;

    public Player(){}

    public Player(String name, Position position, double salary, Team team){
        super(name, salary);
        this.position = position;
        this.team = team;
    }

    @Enumerated(value = EnumType.STRING)
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
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
