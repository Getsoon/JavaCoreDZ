package DZLesson1.Obstacle;

import DZLesson1.Competitor.Competitor;

public class Water extends Obstacle {
    int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}



