package game;

import java.time.Year;

public abstract class Game {
    protected int yearOfReleaze;
    protected float rating;
    protected String os;
    protected String name;
    protected String type;
    Game(){
        os="unknown OS";
    }
    Game(int yearOfReleaze, float rating, String os,String type){
        this.yearOfReleaze=yearOfReleaze;
        this.os=os;
        this.rating=rating;
        this.type = type;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setYearOfReleaze(int yearOfReleaze) {
        this.yearOfReleaze = yearOfReleaze;
    }

    public float getRating() {
        return rating;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public int getYearOfReleaze() {
        return yearOfReleaze;
    }
    protected abstract void setName(String name);
    protected abstract void setType();
}
