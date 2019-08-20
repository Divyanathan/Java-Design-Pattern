package structural.pattern.composite;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Manager  Mani         = new Manager(1001, "Mani", "Team Lead");
        Engineer AbhiShek     = new Engineer(1002, "AbhiShek", "SR. Software Engineer");
        Engineer Simon        = new Engineer(1003, "Simon", "SR. Software Engineer ");
        Engineer Vignesh      = new Engineer(1004, "Vignesh", "Software Engineer");
        Engineer Divyanathan  = new Engineer(1005, "Divyanathan", "Software Engineer");
        Engineer Prashanth    = new Engineer(1006, "Prashanthen", "Testing Engineer");
        Engineer Arun         = new Engineer(1007, "Arun", "Testing Engineer");

        Mani.manageEngineer(AbhiShek);
        Mani.manageEngineer(Simon);
        Mani.manageEngineer(Vignesh);
        Mani.manageEngineer(Divyanathan);
        Mani.manageEngineer(Prashanth);
        Mani.manageEngineer(Arun);

        Work lWork = new Work(Project.SETMORE);
        lWork.addTask("Appointment task");
        lWork.addTask("Chat task");
        lWork.addTask("Reminder task");
        lWork.addTask("Feed task");
        lWork.addTask("Testing Setmore build task");
        lWork.addTask("Testing AW build task");

        Mani.assignWork(Mani,lWork);
        Mani.performWork();

    }
}
