public class SuperHero {
    private String name = "超级英雄";
    private String occupation = "维护世界和平";
    private String task ="维护世界和平";
    private String headquarters = "S.H.I.E.L.D";

    public SuperHero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getOccupation() {
        return occupation;
    }

    void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTask() {
        return task;
    }

    protected void setTask(String task) {
        this.task = task;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void introduce() {
        System.out.printf("****** %s ******\n我是: 超级英雄\n我的职业是: %s\n我的任务是: %s\n我的指挥部是: %s\n", name, occupation, task, headquarters);
    }
}
