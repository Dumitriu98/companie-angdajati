import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List <Candidat> employees;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Candidat> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Candidat> employees) {
        this.employees = employees;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    //to be implemented
    public void recruits(Candidat candidat){
        if(candidat.getNameDep().equalsIgnoreCase("Martketing")){
            Marketing m = new Marketing();
            StatusCandidat status = m.evaluates(candidat);
            candidat.setStatusCandidat(status);

        }else if(candidat.getNameDep().equalsIgnoreCase("Production")){
            Production p = new Production();
            StatusCandidat status = p.evaluates(candidat);
            candidat.setStatusCandidat(status);
        }else {
            throw new EvaluateIncapacity("The candidat can't be evaluated!");
        }
    }
}
