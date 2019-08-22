public class Department {
    private String name;
    private int levelMinCompetition;

    public Department(){}

    public Department(String name, int levelMinCompetition) {
        this.name = name;
        this.levelMinCompetition = levelMinCompetition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelMinCompetition() {
        return levelMinCompetition;
    }

    public void setLevelMinCompetition(int levelMinCompetition) {
        this.levelMinCompetition = levelMinCompetition;
    }
}
