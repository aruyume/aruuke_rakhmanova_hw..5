public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(40);
        boss.setDefence("Physical");

        System.out.println("Boss information: ");
        System.out.println("Boss health: " + boss.getHealth() + ", " + "Boss damage: " +
                boss.getDamage() + ", " + "Boss defence: " + boss.getDefence());

        System.out.println();

        System.out.println("Heroes information: ");
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth() + ", Damage: " +
                    hero.getDamage() + ", Superpower: " + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(180, 20, "Magical");
        Hero hero2 = new Hero(170, 15, "Piercing");
        Hero hero3 = new Hero(160, 10);

        return new Hero[]{hero1, hero2, hero3};
    }
}