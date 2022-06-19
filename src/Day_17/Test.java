package Day_17;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        System.out.println(animal);
        switch (animal) {
            case CAT:
                System.out.println("Its cat");
                break;
            case DOG:
                System.out.println("Its dog");
            case FROG:
                System.out.println("Its frog");
        }
        Season season = Season.WINTER;
        System.out.println(season.getTemp());
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());

    }

}
