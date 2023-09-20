import java.util.ArrayList;
import java.util.List;

class ChildrensGift {
    private List<Sweet> giftItems;

    public ChildrensGift() {
        giftItems = new ArrayList<>();
    }

    public void addSweet(Sweet sweet) {
        giftItems.add(sweet);
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Sweet sweet : giftItems) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public void printGiftContents() {
        System.out.println("Gift Contents:");
        for (Sweet sweet : giftItems) {
            System.out.println(sweet.getType() + ": " + sweet.getName() + " - " + sweet.getWeight() + " grams");
        }
    }
}
