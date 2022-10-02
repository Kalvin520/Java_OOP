package RPG;

import example_5.MathTool;

public class RPG {
    private static Role rol;

    public static void main(String[] args) {
        SwordMan swordMan = new SwordMan();
        swordMan.setName("Justin");
        swordMan.setLevel(1);
        swordMan.setBlood(200);

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);

        showBlood(swordMan);
        showBlood(magician);
        drawFight(swordMan);
        drawFight(magician);
        System.out.println(swordMan.toString());
        System.out.println(magician.toString());
    }
    static void showBlood(Role role){
        System.out.printf("%s 血量 %d%n",role.getName(),role.getBlood());
    }
    static void drawFight(Role role){
        System.out.print(role.getName());
        role.fight();
    }


}
