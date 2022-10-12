import java.util.ArrayList;

public class Item {

    private String itemName;
    private String itemDescription;


    //Eksempel på noget jeg skal forstå....
    /*public Item(String itemDescription){
        this(itemDescription, itemDescription.substring(itemDescription.lastIndexOf("")+1));
    }*/

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

    public String toString(){
    return getItemName() + ": " + getItemDescription() + " ";
    }
}


