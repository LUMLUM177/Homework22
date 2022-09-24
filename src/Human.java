public class Human {

    private final int yearOfBirth;
    private final String name;
    private final String town;
    private final String job;

    public Human(String name, String town, int year, String job) {
        if (year < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = year;
        }
        if (name != null && name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town != null && town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job != null && job.isEmpty()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
