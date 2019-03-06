package DZLesson1.Competitor;

public class Animal implements Competitor {
    protected String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpDistance;

    boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {System.out.println(type + " " + name + " - " + onDistance); }

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpDistance){
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance){
            System.out.println(type + " " + name + " хорошо справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не справился с кроссом ");
            onDistance = false;
        }
    }


    @Override
    public void swim(int dist) {
        if(maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance){
            System.out.println(type + " " + name + " отлично проплыл");
        } else {
            System.out.println(type + " " + name + " не смог проплыть");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height ) {
        if (height <= maxJumpDistance){
            System.out.println(type + " " + name + " удачно перепрыгнул через стену");
        } else {
            System.out.println(type + " " + name + " не перепрыгнул через стену");
            onDistance = false;
        }

    }
}
