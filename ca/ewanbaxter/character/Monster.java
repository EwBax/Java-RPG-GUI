package ca.ewanbaxter.character;

public class Monster extends Character {

    // Monster properties
    private MonsterType monsterType;

    //Constructor
    public Monster(String name, MonsterType monsterType) {
        super(name);
        this.monsterType = monsterType;
    }


    @Override
    public String toString() {

        return String.format("""
                        Monster: %s
                        --------------------
                        HP: %3d      Defense: %3d      Agility: %3d     Base Attack: %3d""",
                super.getName(),
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getBaseAttack()
        );

    }

}
