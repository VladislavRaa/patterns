package ru.x5.Structural.Decorator;

public class DeepFried extends PizzaDecorator {
  public DeepFried(Item pizza) {
    super(pizza);
  }

  @Override
  public void prepare() {
    super.prepare();
    System.out.print(" + глубокая прожарка");
  }
}
