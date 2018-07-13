package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "leagues")
public class League {

    private int id;

    private String name;

    private List<Team> teams;
    public League(){}

    public League(int id, String name, List<Team> teams) {
        this.id = id;
        this.name = name;
        this.teams = teams;
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
    @OneToMany(mappedBy="league", fetch = FetchType.LAZY)
    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
