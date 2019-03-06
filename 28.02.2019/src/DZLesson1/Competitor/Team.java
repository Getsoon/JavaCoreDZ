package DZLesson1.Competitor;

public class Team {

    private String teamName;
    private Competitor[] members;

    public Team(String teamName, Competitor...members){
        this.teamName = teamName;
        this.members = members;
    }

    //Competitor[] competitors = {new Human("Mark"), new Cat("May"), new Dog("Gav")};

    public Competitor[] getMembers() {
        return members;
    }

    public void showResults(){
        for (Competitor o : members){
            if(o.isOnDistance()){
                o.info();
            }
        }
    }
}
