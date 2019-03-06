package DZLesson1;



import DZLesson1.Obstacle.Cross;
import DZLesson1.Obstacle.Wall;
import DZLesson1.Obstacle.Water;
import DZLesson1.Competitor.Cat;
import DZLesson1.Competitor.Dog;
import DZLesson1.Competitor.Human;
import DZLesson1.Competitor.Team;
import DZLesson1.Obstacle.Course;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Cross(1000), new Wall(5), new Water(5000)); // Создаем полосу препятствий
        Team team = new Team("Veteran", new Human("Bruce"), new Cat("Oskar"), new Dog("Bond") , new Cat("Silvester"));
        //Team team2 = new Team("Best",new Human("Kan"), new Cat("Garry"), new Dog("Factor") , new Cat("Don"));
        // Создаем команду
        course.doIt(team);
        //course1.doIt(team2);// Просим команду пройти полосу
        team.showResults(); // Показываем результаты
        //team2.showResults();
    }
}