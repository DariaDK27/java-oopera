import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле \"" + title + "\"");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        int matchIndex = -1;
        int matchCount = 0;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                matchIndex = i;
                matchCount++;
            }
        }

        if (matchCount == 0) {
            System.out.println("В спектакле \"" + title + "\" нет актёра с фамилией " + surname);
            return;
        }

        if (matchCount > 1) {
            System.out.println("В спектакле \"" + title + "\" несколько актёров с фамилией " + surname + " — уточните, кого именно нужно заменить");
            return;
        }

        listOfActors.set(matchIndex, newActor);

    }

    public void printActorsList() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }
}
