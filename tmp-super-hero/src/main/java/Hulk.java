public class Hulk extends SuperHero {
    public Hulk() {
        super("绿巨人");
    }

    @Override
    public void introduce() {
        super.introduce();

        System.out.println("绿巨人额外补充介绍");
    }
}
