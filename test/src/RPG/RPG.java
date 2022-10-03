package RPG;

public class RPG {
    private static Role role;

    public static void main(String[] args) {
        SwordMan swordMan = new SwordMan();
        swordMan.setName("Justin");
        swordMan.setLevel(1);
        swordMan.setBlood(200);

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);

        drawFight(swordMan);
        drawFight(magician);


    }
    static void drawFight(Role role){
        System.out.print(role.getName());
        role.fight();
    }

}
