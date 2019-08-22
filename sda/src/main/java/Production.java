public class Production extends Department implements  Evaluate {

    private String name = "Marketing";
    static final int levelComp = 6;

    public StatusCandidat evaluates(Candidat candidat){
        return StatusCandidat.ACCEPTED;
    }
}
