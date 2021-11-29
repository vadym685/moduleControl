public class Human implements CapableForCombat {

    private String name;
    private Integer age;
    private Boolean canFight = false;
    private Boolean canReport = false;

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Boolean canFight() throws UserException {
        throw new UserException("It is unknown whether man can fight");

    }

    @Override
    public Subordinates canReport() throws UserException {
        throw new UserException("The human obeys no one");
    }
}
