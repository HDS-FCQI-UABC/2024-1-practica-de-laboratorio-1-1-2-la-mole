import java.util.ArrayList;
import java.util.List;
public class Task extends WorkBrkStruct{
    private List<Employee> theEmployees = new ArrayList<>();
    private List<Resource> theResources = new ArrayList<>();

    public Task() {
    }

    public List<Employee> getTheEmployees() {
        return theEmployees;
    }

    public void setTheEmployees(List<Employee> theEmployees) {
        this.theEmployees = theEmployees;
    }

    public List<Resource> getTheResources() {
        return theResources;
    }

    public void setTheResources(List<Resource> theResources) {
        this.theResources = theResources;
    }
}
