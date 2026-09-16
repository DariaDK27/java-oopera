public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Смотрова", Gender.FEMALE, 160);
        Actor actor3 = new Actor("Петр", "Петров", Gender.MALE, 170);

        Director director1 = new Director("Иванна", "Иванова", Gender.FEMALE, 52);
        Director director2 = new Director("Дмитрий", "Дмитриев", Gender.MALE, 67);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        Show drama = new Show("Ревизор", 120, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director1,
                musicAuthor, "Текст либретто оперы «Евгений Онегин»...текст", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2,
                musicAuthor, "Текст либретто балета «Лебединое озеро»...текст", choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        drama.printActorsList();
        opera.printActorsList();
        ballet.printActorsList();

        ballet.replaceActor(actor2, "Петров");
        ballet.printActorsList();

        opera.replaceActor(actor1, "Сидоров");

        opera.printLibretto();
    }
}
