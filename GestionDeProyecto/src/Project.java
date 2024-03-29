import java.util.ArrayList;
import java.util.List;

public class Project
{
    private String name;
    private List<Resource> theResources = new ArrayList<>();
    private List<Employee> theEmployees = new ArrayList<>();
    private WorkBrkStruct WorkBreakdownStructure;

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkBrkStruct getWorkBreakdownStructure() {
        return WorkBreakdownStructure;
    }

    public void setWorkBreakdownStructure(WorkBrkStruct workBreakdownStructure) {
        WorkBreakdownStructure = workBreakdownStructure;
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
