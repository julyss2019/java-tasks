public class IronMan extends SuperHero {
    private String weapon = "钢铁战甲";

    public IronMan() {
        super("钢铁侠");
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void introduce() {
        System.out.printf("****** %s ******\n" +
                "我是: %s\n" +
                "我的武器是: %s\n" +
                "我的职业是: %s\n" +
                "我的任务是: %s\n" +
                "我的指挥部是: %s\n", name, name, weapon, occupation, task, getHeadquarters());
        attack();
        ability();
        contact();
    }
}
