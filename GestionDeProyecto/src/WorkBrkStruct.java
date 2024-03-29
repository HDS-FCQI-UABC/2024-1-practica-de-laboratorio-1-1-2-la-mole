import java.util.ArrayList;
import java.util.List;

public class WorkBrkStruct extends Project
{
    private List<Task> theTasks = new ArrayList<>();

    public WorkBrkStruct() {
        super();
    }

    public List<Task> getTheTasks() {
        return theTasks;
    }

    public void setTheTasks(List<Task> theTasks) {
        this.theTasks = theTasks;
    }
}
