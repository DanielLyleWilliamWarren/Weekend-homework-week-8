package models;

public enum Position {

    FORWARD("Plays up front"),
    MIDFIELDER("Controls the play in the middle"),
    CENTREBACK("Stops opposition forwards"),
    GOALIE("Protects the goal");

    private String playingPosition;

    Position(String playingPosition){
        this.playingPosition = playingPosition;
    }

    public String getPlayingPosition() {
        return playingPosition;
    }
}
