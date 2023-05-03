public class Main {
  //  Создайте класс Soda (для определения типа газированной воды).
  //  У класса должен быть конструктор, принимающий 1 аргумент при инициализации - строку добавка
  //  (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
  //  Напишите для этого класса геттер и сеттер.

  //  Используйте этот класс в вашей программе:
  //  - создайте газировку
  //  - выведите её добавку
  //  - измените добавку
  //  - выведите новую добавку
  public static void main(String[] args) {
    Soda sodaStrawberry = new Soda("Strawberry");
    System.out.println("Current additive - " + sodaStrawberry.getAdditive());
    sodaStrawberry.setAdditive("Watermelon");
    System.out.println("New additive - " + sodaStrawberry.getAdditive());
  }
}
