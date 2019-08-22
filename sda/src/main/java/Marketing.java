public class Marketing  extends Department  implements Evaluate{

    String name = "Productie";
    static final int levelComp = 3;

    public StatusCandidat evaluates(Candidat candidat){
        return StatusCandidat.ACCEPTED;
    }

}
