package structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends Employee {

    List<Work> mWorkList = new ArrayList<>();

    public Engineer(int id, String name, String designation) {
        super(id,name,designation);
    }
    @Override
    public int teamSize() {
        return 1;
    }

    @Override
    public void assignWork(Employee pManager, Work pWork) {
        mWorkList.add(pWork);
        System.out.println(pManager.name +" Assign "+pWork.getlTask().toString()+" to "+this.name+" \n");

    }

    @Override
    public void performWork() {
        for (Work lWork : mWorkList){
            System.out.println(this.name +" is performing "+lWork.getlTask() +" task under "+lWork.getlProject()+"\n");
        }
    }
}
