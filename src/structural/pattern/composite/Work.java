package structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Work {

    private Project lProject;
    private List<String> lTask = new ArrayList<>();

    public Work(Project pProject) {
        lProject = pProject;
    }

    public void addTask(String pTask){
        lTask.add(pTask);
    }
    public void removeTask(String pTask){
        lTask.remove(pTask);
    }

    public Project getlProject() {
        return lProject;
    }

    public void setlProject(Project lProject) {
        this.lProject = lProject;
    }

    public List<String> getlTask() {
        return lTask;
    }

    public void setlTask(List<String> lTask) {
        this.lTask = lTask;
    }
}
