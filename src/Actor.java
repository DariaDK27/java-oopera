import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object ac) {
        if (this == ac) {
            return true;
        }
        if (!super.equals(ac)) {
            return false;
        }
        Actor actor = (Actor) ac;
        return height == actor.height;


    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
