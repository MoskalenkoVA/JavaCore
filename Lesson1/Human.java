package Lesson1;

public class Human implements Actions {
    public int MaxHeight;
    public int MaxRun;

    public Human(int MaxHeight, int MaxRun) {
        this.MaxHeight = MaxHeight;
        this.MaxRun = MaxRun;

    }
    public boolean jump (Wall wall) {
        if (MaxHeight > wall.height) {
            System.out.println("Человек перепрыгнул стену");
            return true;
        } else {
            System.out.println("Человек не перепрыгнул, стена высоковата!!!");
            return false;
        }
    }
    public boolean run (Treadmill treadmill) {
        if (MaxRun > treadmill.length) {
            System.out.println("Человек пробежал марафон");
            return true;
        } else {
            System.out.println("Человек не пробежал");
            return false;
        }
    }
}
