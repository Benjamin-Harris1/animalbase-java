package base.animal.data;

public class Animal {
    private int id;
    private String name;
    private String type;
    private String description;
    private int age;
    private boolean star;
    private boolean winner;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", star=" + star +
                ", winner=" + winner +
                '}';
    }

    public Animal(){}

    public Animal(Animal other){
        this.id = other.id;
        this.name = other.name;
        this.type = other.type;
        this.description = other.description;
        this.age = other.age;
        this.star = other.star;
        this.winner = other.winner;
    }

    public Animal(String name, String type, String description, int age){
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
    }

    public Animal(String string, int age){
        String[] parts = string.split(" ");
        this.name = parts[0];
        this.description = parts[2];
        this.type = parts[3];
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
