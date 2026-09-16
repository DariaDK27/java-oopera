import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, String gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object ac) {
        if (this == ac) {
            return true;
        }
        if (ac == null || getClass() != ac.getClass()) {
            return false;

        }
        Actor actor = (Actor) ac;
        return height == actor.height && Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname());


    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
