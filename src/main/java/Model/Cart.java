package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable
{
    private ArrayList<LineItem> items;
    
    public Cart()
    {
        items = new ArrayList<LineItem>();
    }
    
    public ArrayList<LineItem> getItems()
    { 
        return items;
    }
    
    public int getCount()
    { 
        return items.size();
    }
    
    public void addItem(LineItem item)
    {
        String itemCode = item.getProduct().getitemCode();
        int quantity = item.getQuantity();
        for (int i = 0; i < items.size(); i++)
        {
            LineItem lineItem = items.get(i);
            if  (lineItem.getProduct().getitemCode().equals(itemCode))
            {
                lineItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }
    
    public void removeItem(LineItem item)
    {
        long itemCode = item.getProduct().getId();
        for (int i = 0; i < items.size(); i++)
        {
            LineItem lineItem = items.get(i);
            if (lineItem.getProduct().getitemCode().equals(itemCode))
            {
                items.remove(i);
                return;
            }
        }
    }
}