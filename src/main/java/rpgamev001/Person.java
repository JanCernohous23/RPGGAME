
package rpgamev001;
public class Person {
    private String name;
    private TypeOfJob job;
    private float hp;
    private int level;
    private int age;
    private float speed;
    private float strength;
    private float intelligence;
    private StateOfPerson stateofperson;
    
    public Person (){   
        
        
    }
//name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//job
    public TypeOfJob getJob() {
        return job;
    }
    public void setJob(TypeOfJob job) {
        this.job = job;
    }
//hp
    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }
//level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
//age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//speed
    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
//strength
    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }
//intelligence
    public float getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(float intelligence) {
        this.intelligence = intelligence;
    }
//stateofperson
    public StateOfPerson getStateofperson() {
        return stateofperson;
    }

    public void setStateofperson(StateOfPerson stateofperson) {
        this.stateofperson = stateofperson;
    }
    
    
}
