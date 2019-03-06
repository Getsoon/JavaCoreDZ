package DZLesson1.Obstacle;


import DZLesson1.Competitor.Team;
import DZLesson1.Competitor.Competitor;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Competitor c : team.getMembers()){
            for (Obstacle o : obstacles){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}
