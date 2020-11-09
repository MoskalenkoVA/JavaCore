package Lesson1;

public class Cat implements Actions {
    public int MaxHeight;
    public int MaxRun;

    public Cat (int MaxHeight, int MaxRun) {
        this.MaxHeight = MaxHeight;
        this.MaxRun = MaxRun;
    }

    public boolean run (Treadmill treadmill) {
        if (MaxRun >= treadmill.length) {
            System.out.println("Кот пробежал этот марафон!!!");
            return true;
        } else {
            System.out.println("Кот не добежал (((");
            return false;
        }
    }

    public boolean jump (Wall wall) {
        if (MaxHeight > wall.height) {
            System.out.println("Кот перепрыгнул стену");
            return true;
        } else {
            System.out.println("Кот не осилил эту стену");
            return false;
        }
    }



}
