package project;

public class classObject
{
    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private String color;
    private double weight;
    public void display()
    {
        System.out.println("the color of car is:"+color);
        System.out.println("the weight of the car is:"+weight);
    }
}
