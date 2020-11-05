package Lesson1;

public class Cat {
    public int MaxHeight;
    public int MaxRun;

    public Cat (int MaxHeight, int MaxRun) {
        this.MaxHeight = MaxHeight;
        this.MaxRun = MaxRun;
    }

    public void jump (Wall wall) {
        if (MaxHeight > wall.height) {
            System.out.println("Кот перепрыгнул стену");
        } else {
            System.out.println("Кот не осилил эту стену");
        }
    }
    public void run (Treadmill treadmill) {
        if (MaxRun > treadmill.length) {
            System.out.println("Кот пробежал этот марафон!!!");
        } else {
            System.out.println("Кот не добежал (((");
        }
    }


}
