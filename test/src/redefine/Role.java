package redefine;

public abstract class Role {
    protected String name;
    protected int level;
    protected int blood;

    public abstract void fight();

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }
    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return blood;
    }
    public String toString(){
        return String.format("(%s , %d, %d)",this.name,this.level,this.blood);
    }
}
