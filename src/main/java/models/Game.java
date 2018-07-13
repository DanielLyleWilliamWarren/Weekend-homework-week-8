package models;


public class Game {

    private Team team;

    public Game(Team team){
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
