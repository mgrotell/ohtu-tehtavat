package ohtu;

public class Player implements Comparable<Player> {

    private String name;
    private String nationality;
    private int assits;
    private int goals;
    private int penalties;
    private String team;
    private int games;

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAssits(int assits) {
        this.assits = assits;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public String getNationality() {
        return this.nationality;
    }

    @Override
    public String toString() {
        return this.name + " " + this.team + " " + this.goals + " " + this.assits + " = " + (this.goals + this.assits);
    }

    @Override
    public int compareTo(Player arg0) {
        return this.goals + this.assits >= arg0.assits + arg0.goals ? -1 : 1;
    }

}
