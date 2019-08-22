import javax.swing.*;

public class Marketing  extends Department implements Evaluate{

//    static final String name = "Productie";
//    static final int levelComp = 3;

    public Marketing(){}

    public Marketing(String name, int levelMinCompetition) {
        super("Marketing", 3);
    }

    public StatusCandidat evaluates(Candidat candidat){

        if(candidat.getLevelComp() > super.getLevelMinCompetition()){
            return StatusCandidat.ACCEPTED;
        }else if(candidat.getLevelComp() < super.getLevelMinCompetition()){
            return StatusCandidat.REJECTED;
        }else {
            return StatusCandidat.WAITING;
        }
    }

}
