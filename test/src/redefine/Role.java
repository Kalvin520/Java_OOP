package redefine;

public abstract class Role {
    protected String name;
    protected int level;
    protected int blood;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}
