public class Soldier extends Human{
    private Boolean canFight;

    private Subordinates subordinates = Subordinates.CAPITAN;

    public Soldier(String name, Integer age) {
        super(name, age);
        this.canFight = true;

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Boolean canFight() {
        return canFight;
    }

    @Override
    public Subordinates canReport() {
        return subordinates;
    }
}
