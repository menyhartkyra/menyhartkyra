package zoo;

public class Bird extends Animal {

  public Bird(String name){
    this.name = name;
  }

  @Override
  String breed() {
    return "laying eggs";
  }
}
