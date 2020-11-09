package Lesson1;

public class Robot implements Actions {
    public int MaxHeight;
    public int MaxRun;

    public Robot (int MaxHeight, int MaxRun) {
        this.MaxHeight = MaxHeight;
        this.MaxRun = MaxRun;
    }

    public boolean jump (Wall wall) {
        if (MaxHeight > wall.height) {
            System.out.println("Робот перепрыгнул эту стену");
            return true;
        } else {
            System.out.println("Робот не прыгнул стену");
            return false;
        }
    }

    public boolean run (Treadmill treadmill) {
        if (MaxRun > treadmill.length) {
            System.out.println("Робот пробежал дистанцию");
            return true;
        } else {
            System.out.println("Робот не пробежал");
            return false;
        }
    }

}
