package redefine;

public class RPG {
    public static void main(String[] args) {
        var swordMan = new SwordsMan();
        swordMan.setName("Justin");
        swordMan.setLevel(1);
        swordMan.setBlood(200);

        var magician = new Magician();
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
