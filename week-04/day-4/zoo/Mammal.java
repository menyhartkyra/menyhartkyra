package zoo;

public class Mammal extends Animal{

  public Mammal(String name){
    this.name = name;
  }

  @Override
  String breed() {
    return "pushing miniature versions out";
  }

}
