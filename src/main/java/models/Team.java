package models;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private int points;
    private Manager manager;
    private List<Player> players;
    private double budget;
    private League league;
    private int goals;

    public Team() {
    }

    public Team(String name, int points, double budget, League league) {
        this.name = name;
        this.points = 0;
        this.budget = budget;
        this.league = league;
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

    @Column(name = "points")
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @OneToOne(mappedBy = "team", fetch = FetchType.LAZY)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @ManyToOne
    @JoinColumn(name = "league_id", nullable = false)
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
    @Column(name = "goals")
    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void scoreGoals(){
        Random rand = new Random();
        int n = rand.nextInt(5);
        goals = n;
    }

    public void addPoints(int points) {
        this.points += points;
    }
}
