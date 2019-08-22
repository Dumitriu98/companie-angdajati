public class Department {
    private String name;
    static final int levelMinCompetition = 3;

    public Department(){}

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getLevelMinCompetition() {
        return levelMinCompetition;
    }
}
