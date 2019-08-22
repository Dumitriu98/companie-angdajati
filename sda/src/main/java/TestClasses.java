import java.util.ArrayList;
import java.util.List;

public class TestClasses {
    public static void main(String[] args) {
        Company company = new Company("Google");

        Department departmentMarketing = new Marketing();
        Department departmentProduction = new Production();
        Department departmentHR = new Department("HR",5);

        List <Department> departments = new ArrayList<>();
        departments.add(departmentMarketing);
        departments.add(departmentProduction);
        departments.add(departmentHR);

        company.setDepartments(departments);

        Candidat candidat1 = new Candidat("Pop","Noah",5,"Marketing");
        Candidat candidat2 = new Candidat("Stefan","Sebastian",7,"Production");
        Candidat candidat3 = new Candidat("Aurica","Doru",10,"Production");
        Candidat candidat4 = new Candidat("Luca","Marian",9,"HR");

        List <Candidat> candidats = new ArrayList<>();
        candidats.add(candidat1);
        candidats.add(candidat2);
        candidats.add(candidat3);
        candidats.add(candidat4);

        company.setEmployees(candidats);

        for(Candidat candidat : candidats){
            try {
                company.recruits(candidat);
                System.out.println(candidat.getStatusCandidat());
            }catch (EvaluateIncapacity e) {
                System.out.println("Exception!");
            }
        }
    }
}
