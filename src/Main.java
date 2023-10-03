import game.Quest;
import game.Shooter;
import game.Strategy;
import printers.Printer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shooter doom = new Shooter();
        doom.setName("Doom");
        doom.setOs("Any");
        doom.setYearOfReleaze(1993);
        doom.setRating(8.5F);
        doom.setWeapon("Gun");
        doom.setLevels(100);
        Shooter ss = new Shooter(100,8,"Windows",2001,"gun", "Serious Sam");
        Quest syberia = new Quest(12,8.2F,"Windows",2004, "Syberia");
        Quest neverhood = new Quest(8,8.7F,"Windows",2005, "NEVERHOOD");
        Strategy civilizationVI = new Strategy(4,1000,true,9.0F,"Windows",2016, "Civilization VI");
        Printer.printQuest(syberia);
        Printer.printShooter(doom);
        Printer.printStrategi(civilizationVI);
        Printer.printShooter(ss);
    }
}