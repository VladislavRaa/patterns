package ru.x5.Structural.Decorator;

public class Pizza implements Item {
  @Override
  public void prepare() {
    System.out.print("Пицца");
  }
}
