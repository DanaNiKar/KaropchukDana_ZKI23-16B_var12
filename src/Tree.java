public class Tree {
    private int age;
    private double height;
    private String species;
    private String location;

    //конструктор по умолчанию
    public Tree() {
        this.age = 0;
        this.height = 0.0;
        this.species = "Неизвестный вид";
        this.location = "Неизвестное местоположение";
    }

    //конструктор с параметрами
    public Tree(int age, double height, String species, String location) {
        this.age = age;
        this.height = height;
        this.species = species;
        this.location = location;
    }

    //геттеры - методы доступа
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    //сеттеры - методы модификации
    public void setAge(int age) {
        if (age >=0) {
            this.age = age;
        }
        else {
            System.out.println("Не может быть отрицательным");
        }
    }

    public void setHeight(double height) {
        if (height >=0) {
            this.height = height;
        }
        else {
            System.out.println("Не может быть отрицательной");
        }
    }

    public void setSpecies(String species) {
        if (!species.trim().isEmpty()) {
            this.species = species;
        }
        else {
            System.out.println("Не может быть пустым");
        }
    }

    public void setLocation(String location) {
        if (!location.trim().isEmpty()) {
            this.location = location;
        }
        else {
            System.out.println("Не может быть пустым");
        }
    }

    //метод для вывода информации о дереве
    public void displayInfo(int index) {
        System.out.println("Дерево " + index);
        System.out.println("Вид: " + species + ", Возраст: " + age + " лет, Высота " + height + " м., Местоположение: " + location);
    }

    //дополнительный метод на основе известных значений
    public boolean isMature() {
        return this.age >=10;
    }
}
