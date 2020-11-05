package Lesson1;

public class Robot {
    public int MaxHeight;
    public int MaxRun;

    public Robot (int MaxHeight, int MaxRun) {
        this.MaxHeight = MaxHeight;
        this.MaxRun = MaxRun;
    }

    public void jump (Wall wall) {
        if (MaxHeight > wall.height) {
            System.out.println("Робот перепрыгнул эту стену");
        } else {
            System.out.println("Робот не прыгнул стену");
        }
    }

    public void run (Treadmill treadmill) {
        if (MaxRun > treadmill.length) {
            System.out.println("Робот пробежал дистанцию");
        } else {
            System.out.println("Робот не пробежал");
        }
    }

}
