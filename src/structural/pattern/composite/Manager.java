package structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    List<Employee> mManagingEngineer = new ArrayList<>();
    public Manager(int id, String name, String designation) {
        super(id,name,designation);
    }
    @Override
    public int teamSize() {
        return mManagingEngineer.size();
    }

    @Override
    public void assignWork(Employee pManager, Work pWork) {
        System.out.println(this.name + " has assigned to Work on '" + pWork.getlProject() + "' by manager " + pManager.getName());
        System.out.println(" --------- "+pManager.name + " distributing Work to his Team mates  --------\n");
        List<String> totalWork = pWork.getlTask();
        Employee lEngineer;
        Work lWork;
        for (int i = 0; i < mManagingEngineer.size(); i++) {
            if (i == totalWork.size()) {
                break;
            }
            System.out.println("Assigning " + pWork.getlTask().get(i) + " to " + mManagingEngineer.get(i).getName() + " under " + pWork.getlProject());
            lEngineer = mManagingEngineer.get(i);
            lWork     = new Work(pWork.getlProject());
            lWork     .addTask(pWork.getlTask().get(i));
            lEngineer  .assignWork(this,lWork);

        }
    }

    @Override
    public void performWork() {
        System.out.println("-------- "+this.name+" is asking his engineers to perform the given task"+" --------\n");
        for (Employee lEngineer: mManagingEngineer){
            lEngineer.performWork();
        }
    }

    /**
     * This method is use to add the employee to be work under particular manager
     * @param pEngineer
     * @return
     */
    public boolean manageEngineer(Employee pEngineer){
        return mManagingEngineer.add(pEngineer);
    }
    public boolean stopEnagingEngineer(Employee pEngineer){
        return mManagingEngineer.remove(pEngineer);
    }

}
