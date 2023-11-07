public class Test {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("超级英雄们");
        Hulk hulk = new Hulk();
        IronMan ironMan = new IronMan();

        superHero.introduce();
        hulk.introduce();
        ironMan.introduce();
    }
}
