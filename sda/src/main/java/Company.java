import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List <Candidat> employees;
    private List<Department> departments;

    public Company(String name, List<Candidat> employees) {
        this.name = name;
        this.employees = employees;
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

    //to be implemented
    public void recruits(Candidat candidat){

        if(){
            throw new IncapacitateEvaluare();
        }

        try{


        }catch(IncapacitateEvaluare e){
            System.out.println("Candidatul nu indeplineste cerintele cerute!");
        }

    }

}
