import java.io.*;

// ... (Определение классов Sweet, Candy, OtherSweets и ChildrensGift) ...

public class Main {
    public static void main(String[] args) {
        // Создайте и добавьте сладости в подарок
        ChildrensGift childrensGift = new ChildrensGift();
        childrensGift.addSweet(new Candy("Chocolate Bar", 50.0, "Milk Chocolate"));
        childrensGift.addSweet(new Candy("Lollipop", 10.0, "Fruit"));


        // Сериализация подарка
        serializeGift(childrensGift, "gift.ser");

        // Десериализация подарка
        ChildrensGift deserializedGift = deserializeGift("gift.ser");

        if (deserializedGift != null) {
            System.out.println("Десериализованнo:");
            deserializedGift.printGiftContents();
        }
    }

    // Метод для сериализации объекта ChildrensGift в файл
    public static void serializeGift(ChildrensGift gift, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(gift);
            System.out.println("Cериализован в файл " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации объекта ChildrensGift из файла
    public static ChildrensGift deserializeGift(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (ChildrensGift) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
