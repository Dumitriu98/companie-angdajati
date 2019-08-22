public class Candidat {

   private String name;
   private String lastName;
   private int levelComp;
   private String nameDep;

    public Candidat(String name, String lastName, int levelComp, String nameDep){
        this.name = name;
        this.lastName = lastName;
        this.levelComp = levelComp;
        this.nameDep = nameDep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLevelComp() {
        return levelComp;
    }

    public void setLevelComp(int levelComp) {
        this.levelComp = levelComp;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }
}
