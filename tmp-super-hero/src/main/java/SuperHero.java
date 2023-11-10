public class SuperHero {
    public String name = "超级英雄";
    String occupation = "维护世界和平";
    protected String task = "打败洛基";
    private String headquarters = "S.H.I.E.L.D";

    public SuperHero(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.printf("****** %s ******\n" +
                "我是: 超级英雄\n" +
                "我的职业是: %s\n" +
                "我的任务是: %s\n" +
                "我的指挥部是: %s\n", name, occupation, task, headquarters);
    }

    public void attack() {
        System.out.println("我的攻击行为");
    }

    protected void ability() {
        System.out.println("我的能力介绍");
    }

    void contact() {
        System.out.println("我的联络方式");
    }

    private void recruit() {
        System.out.println("快来加入");
    }

    public String getHeadquarters() {
        return headquarters;
    }
}
