package game;

public class Shooter extends Game{
    private int levels;
    private String weapon;
    public Shooter(){
        super();
        levels=0;
        setType();
    }
    public Shooter(int levels, float rating, String os, int year, String weapon,String name){
        super(year, rating, os, "Shooter");
        this.levels =levels;
        this.weapon=weapon;
        setType();
        setName(name);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public void setName(String name){
        this.name=name;
    }
    public int getLevels(){
        return levels;
    }

    public String getWeapon() {
        return weapon;
    }
    @Override
    public void setType(){
        type = "Shooter";
    }
}
