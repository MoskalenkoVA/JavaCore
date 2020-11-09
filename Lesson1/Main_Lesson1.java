package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main_Lesson1 {
    public static void main(String[] args) {
//        Cat cat = new Cat(5, 200);
//        cat.run(new Treadmill(3330) );
//        cat.jump(new Wall(3));
//        Human human = new Human(10,1000);
//        human.jump(new Wall(7));
//        Robot robot = new Robot(100, 10000);
//        robot.jump(new Wall(50));
//        robot.run(new Treadmill(4444));

        List<Actions> creatures = new ArrayList<>();
        creatures.add(new Cat(5, 200));
        creatures.add(new Human(10, 1000));
        creatures.add(new Robot(100, 20000));

        List<Object> obstacles = new ArrayList<>();
        obstacles.add(new Wall(10));
        obstacles.add(new Treadmill(500));

        for (Actions act : creatures) {
            for (Object obs : obstacles) {
                boolean result;
                if (obs instanceof Wall) {
                    result = act.jump((Wall) obs);
                } else  {
                    result = act.run((Treadmill) obs);

                }

                if (!result) {
                    break;
                }
                
            }
            
        }






    }
}
