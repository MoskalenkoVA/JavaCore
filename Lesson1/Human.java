package Lesson1;

public class Human {
    public int MaxHeight;
    public int MaxRun;

    public Human(int MaxHeight, int MaxRun) {
        this.MaxHeight = MaxHeight;
        this.MaxRun = MaxRun;

    }
    public void jump (Wall wall) {
        if (MaxHeight > wall.height) {
            System.out.println("Человек перепрыгнул стену");
        } else {
            System.out.println("Человек не перепрыгнул, стена высоковата!!!");
        }
    }
    public void run (Treadmill treadmill) {
        if (MaxRun > treadmill.length) {
            System.out.println("Человек пробежал марафон");
        } else {
            System.out.println("Человек не пробежал");
        }
    }
}
