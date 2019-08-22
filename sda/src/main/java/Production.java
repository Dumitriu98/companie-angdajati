public class Production extends Department implements  Evaluate {

//    private String name = "Productian";
//    static final int levelComp = 6;


    public Production() {
    }

    public Production(String name, int levelMinCompetition) {
        super("Production", 6);
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
