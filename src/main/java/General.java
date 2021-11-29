public class General extends Human {
    private Boolean canFight;
    private Subordinates subordinates;

    public General(String name, Integer age) {
        super(name, age);
        this.canFight = false;

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
    public Subordinates canReport() throws UserException {
        if (subordinates == null) {
            throw new UserException("The general obeys no one");
        } else {
            return subordinates;
        }
    }


}
