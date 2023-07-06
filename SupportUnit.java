public abstract class SupportUnit extends Unit {

    public int manaPoints;
    public int magicDamage;
    public int attackRange;
    public int actionPriority; //0 - help; 1 - attack

    public SupportUnit(int[] position, int initiative, int manaPoints, int magicDamage, int attackRange, int actionPriority) {
        super(position, 50, 50, 5, 1, initiative, true);

        this.manaPoints = manaPoints;
        this.magicDamage = magicDamage;
        this.attackRange = attackRange;
        this.actionPriority = actionPriority;
    }
    
}
