public class HeroMain {

    public static void main(String[] args) {

        Hero karl = new Hero("Karl",HeroType.TANK);
        Hero peter = new Hero("Peter",HeroType.HEALER);
        Hero robert = new Hero("Robert",HeroType.ASSASSIN);

        System.out.println(karl);
        System.out.println(peter);
        System.out.println(robert);


        karl.takeDamage(150);
        peter.takeDamage(22);
        robert.takeDamage(50);
    }
}