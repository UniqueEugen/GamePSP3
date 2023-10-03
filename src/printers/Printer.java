package printers;

import game.Quest;
import game.Shooter;
import game.Strategy;

public class Printer {
    public static void printQuest(Quest quest){
        String str;
        str = "Игра " + quest.getType() +" под названием "+ quest.getName()+" год релиза "+ quest.getYearOfReleaze()+
                " на платформе " + quest.getOs() + " для возраста " + quest.getAge()+ "+ и рейтингом "+quest.getRating();
        System.out.println(str);
    }
    public static void printShooter(Shooter shooter){
        String str;
        str = "Игра " + shooter.getType() +" под названием "+ shooter.getName()+" год релиза "+ shooter.getYearOfReleaze()+
                " на платформе " + shooter.getOs() + " имеющееся оружие " + shooter.getWeapon()+ " количеством уровней "
                +shooter.getLevels()+ "и рейтингом "+shooter.getRating();
        System.out.println(str);
    }
    public static void printStrategi(Strategy strategy){
        String str;
        str = "Игра " + strategy.getType() +" под названием "+ strategy.getName()+" год релиза "+ strategy.getYearOfReleaze()+
                " на платформе " + strategy.getOs() + " имеющиеся карты " + strategy.getMaps()+ " количеством юнитов "
                +strategy.getMaxUnits()+ (strategy.isCanCreateMap() ? " возможностью " : "") + "и рейтингом "+strategy.getRating();
        System.out.println(str);
    }

}
