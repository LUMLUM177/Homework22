public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим","Минск", 1987, "бренд-менеджером");
        Human anya = new Human("Аня", "Москва", 1993, "методистом обраовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджером");
        Human artem = new Human("Артём", "Москва", 1995, "директором по развитию бизнеса");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println();

        Car ladaGrande = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия");
        Car kiaSportage = new Car("KIA", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);


    }
}