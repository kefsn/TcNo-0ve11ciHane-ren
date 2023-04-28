package advaday07;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    //orders== [Order klasından (ordercode==1001, items((seçenekler) hamburger 4 adet),ordercode==1002, items((seçenekler) salata 2 adet),]

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
    public void removeMenuItem(MenuItem item) {
        menu.remove(item);

    }



        public static void main(String[] args) {
        //Menü öğelerini oluşturduk.
        MenuItem item1 = new MenuItem(101, "Hamburger", 500.00);
        MenuItem item2 = new MenuItem(102, "Pizza", 600.00);
        MenuItem item3 = new MenuItem(103, "Kofte", 700.00);
        MenuItem item4 = new MenuItem(104, "Salata", 100.00);

        // Resturant nesnesini oluşturalım menü öğelerini ekledik.
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(item1);
        restaurant.addMenuItem(item2);
        restaurant.addMenuItem(item3);
        restaurant.addMenuItem(item4);

            Scanner input = new Scanner(System.in);
           boolean exit = false;

           while (!exit){

               System.out.println("************* RESTAURANT SİPARİŞ SİSTEMİ *************");
               System.out.println("1- MENUYU GOSTER");
               System.out.println("2- SİPARİŞ OLUŞTUR");
               System.out.println("3- SİPARİŞ İPTAL ET");
               System.out.println("4- SİPARİŞLERİ GÖSTER");
               System.out.println("5- HESAP FİŞİ YAZDIR");
               System.out.println("0- ÇIKIŞ");
               System.out.println("Seçiminiz : ");

              int choice =  input.nextInt();

              switch (choice){
                  case 0 :
                      exit=true;
                      break;
                  case 1 :
                      //"1- MENUYU GOSTER"
                      restaurant.displayMenu();
                      break;
                  case 2 :
                      //"2- SİPARİŞ OLUŞTUR"
                      System.out.println("Yiyeceğin kodunu giriniz..");
                      int code = input.nextInt();
                      System.out.println("Kaç adet istiyorsunuz..");
                      int adet = input.nextInt();
                      restaurant.createOrder(code,adet);
                      break;
                  case 3 :
                      //3- SİPARİŞ İPTAL ET"
                      break;
                  case 4 :
                      //"4- SİPARİŞLERİ GÖSTER"
                      break;
                  case 5 :
                      //"5- HESAP FİŞİ YAZDIR"
                      break;
                  default:
                      System.out.printf("Geçersiz seçim..");


              }

           }


    }//main

    private void createOrder(int code, int adet) {
        //"2- SİPARİŞ OLUŞTUR"

      MenuItem item =
                menu.
                stream().
                filter(t->t.getCode()==code).
                findFirst().//Varsa ilkini döndürsün
                orElse(null);//Yoksa orElse döndürsün...

        if(item!= null){//item varsa

            Order order = new Order();
            order.addItem(item, adet);
            orders.add(order);

            removeMenuItem(item);//Silmek istiyorsa kaldıracak.
            System.out.printf("Sipariş oluşturuldu Sipariş kodu  %d\n ", order.getOrderCode());



        }else {
            System.out.println("Yanlış yiyecek kodu");
        }

    }

    private void displayMenu() {
//"1- MENUYU GOSTER"
        System.out.println("***************MENU**************");

        //KOD       Yiyecek İsmi    Fiyat
        //101        Hamburger       500 lira yazacak
        System.out.printf("%-10s   %-30s  %s\n" , "KOD","Yiyecek İsmi", "Fiyat");

        for (MenuItem item : menu){
            System.out.printf("%-10d %-30s  %.2f\n ",item.getCode(),item.getName(),item.getPrice());
        }


    }

}
