import java.util.ArrayList;

public class Item {

    private String itemName;
    private String itemDescription;

    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nItem Name: ").append(getItemName()).append("\n");
        sb.append("Item Description: ").append(getItemDescription()).append("\n");

        // Fjern det første og sidste tegn (klammer)
        String result = sb.toString();
        if (result.length() > 1) {
            result = result.substring(0, result.length() - 1);
        }

        return result;

    }

}


