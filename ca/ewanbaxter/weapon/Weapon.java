package ca.ewanbaxter.weapon;

public abstract class Weapon {

    // Weapon Properties
    private int weight;
    private int attackMod;

    // Constructor
    public Weapon(int weight, int attackMod) {
        this.weight = weight;
        this.attackMod = attackMod;
    }

    @Override
    public String toString() {

        return String.format("""
                        Weapon: %s            Weight: %d      Attack Mod: %d""",
                this.getClass().getSimpleName(),
                this.weight,
                this.attackMod
        );

    }

    //----------------------------------------------------------------------------------------------
    //---------------------------------GETTERS AND SETTERS------------------------------------------
    //----------------------------------------------------------------------------------------------

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAttackMod() {
        return attackMod;
    }

    public void setAttackMod(int attackMod) {
        this.attackMod = attackMod;
    }
}
