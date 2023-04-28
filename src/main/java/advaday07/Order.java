package advaday07;

import java.util.HashMap;

public class Order {
    private  static int orderCount = 1000;
    private int orderCode;//Sipariş codu'dur.Unique dır.
    private HashMap<MenuItem, Integer> items = new HashMap<>();
    //items(seçenekler) HashMap'in içinde yenilenden kaç adet yenildiği (Örneğin : pizza, 2 adet)
    private double totalAmount =0;

    public Order() {

        orderCode = orderCount++;//Sipariş'in sayacı
    }

  public void addItem(MenuItem item, int adet){//Menu Seçeneklerde, seçenek ve adet sayısı için
       items.put(item,adet);//items seçenekler HashMap'ine, argüman olarak verilen item seçenek eklenir.
  totalAmount += item.getPrice()*adet;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
