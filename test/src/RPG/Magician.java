package RPG;

public class Magician extends Role {
    @Override
    public void fight() {
        System.out.println("魔法攻擊");
    }

    public void cure() {
        System.out.println("魔法治癒");
    }

    public String toString(){
        return String.format("魔法師 (%s, %d, %d)",this.name,this.level,this.blood);
    }
}
