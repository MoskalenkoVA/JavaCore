package Lesson1;

public class Main_Lesson1 {
    public static void main(String[] args) {
        Cat cat = new Cat(5, 200);
        cat.run(new Treadmill(3330) );
        cat.jump(new Wall(3));
        Human human = new Human(10,1000);
        human.jump(new Wall(7));
        Robot robot = new Robot(100, 10000);
        robot.jump(new Wall(50));
        robot.run(new Treadmill(4444));






    }
}
