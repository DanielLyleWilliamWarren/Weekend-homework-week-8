package models;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "leagues")
public class League {

    private int id;
    private String name;
    private List<Team> teams;

    public League() {
    }

    public League(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY)
    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void playGame(Team team, Team team1) {
        team.scoreGoals();
        team1.scoreGoals();
        if (team.getGoals() > team1.getGoals()) {
            team.addPoints(3);
        } else if (team.getGoals() < team1.getGoals()) {
            team1.addPoints(3);
        } else {
            team1.addPoints(1);
            team.addPoints(1);
        }
    }
}
