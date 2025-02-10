public class Dog {

    public String name;
    public int age;
    public String color;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name=" + name + " Age=" + age + " Color=" + color;
    }
}
