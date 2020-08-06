package thegarden;

public class Main {
  public static void main(String[] args) {
    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");
    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");
    Garden garden = new Garden();

    garden.addPlant(flower1);
    garden.addPlant(flower2);
    garden.addPlant(tree1);
    garden.addPlant(tree2);

    garden.info();
    garden.water(40);
    garden.info();
    garden.water(70);
    garden.info();
  }
}
