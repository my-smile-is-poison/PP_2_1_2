import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private int weight;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cat cat = (Cat) o;

        if (age != cat.age) {
            return false;
        }
        if (!Objects.equals(name, cat.name)) {
            return false;
        }
        return Objects.equals(weight, cat.weight);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 13 * result + age + weight;
        return result;
    }




}
