package game;

public class Strategy extends Game{
    private int maxUnits;
    private int maps;
    private boolean canCreateMap;
    public Strategy(){
        super();

        setType();
        setName("no name");
    }
    public Strategy(int maps, int maxUnits, boolean canCreateMap, float rating, String os, int year, String name){
        super(year, rating, os, "Strategy");
        this.maps =maps;
        this.canCreateMap=canCreateMap;
        this.maxUnits=maxUnits;
        setType();
        setName(name);
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void setType(){
        type = "Strutegy";
    }

    public void setMaps(int maps) {
        this.maps = maps;
    }

    public void setMaxUnits(int maxUnits) {
        this.maxUnits = maxUnits;
    }

    public void setCanCreateMap(boolean canCreateMap) {
        this.canCreateMap = canCreateMap;
    }

    public int getMaxUnits(){
        return maxUnits;
    }

    public boolean isCanCreateMap() {
        return canCreateMap;
    }

    public int getMaps() {
        return maps;
    }

}
