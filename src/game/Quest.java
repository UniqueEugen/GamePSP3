package game;

public class Quest extends Game{
    private int age;
    public Quest(){
        super();
        age=0;
        setType();
        setName("no name");
    }
    public Quest(int age, float rating, String os, int year, String name){
        super(year, rating, os, "Quest");
        this.age =age;
        setType();
        setName(name);
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void setType(){
        type = "Quest";
    }
    public int getAge(){
        return age;
    }

}
