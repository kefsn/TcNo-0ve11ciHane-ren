package javaders.day13ncrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {
        /*
        increment:
         */
        int a = 5;
        System.out.println(a);

        a = a + 2;
        System.out.println(a);

        //a+=2;  == a=a+2;
        //Bir tane int variable oluşturup iki şekilde 5 artırırın

        int b = 10;
        System.out.println(b);

        b = b + 5;
        System.out.println(b);

        b+=2;
        System.out.println(b);

        //Decrement:

        int c = 8;
        System.out.println(c);
        c = c-3;
        System.out.println(c);
        c-=2;
        System.out.println(c);

        //Increment 2;

        int d = 6;
        System.out.println(d);
        d = d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);

        //Decrement 2:

        int e = 24;
        System.out.println(e);
        e = e/2;
        System.out.println(e);
        e/=2;
        System.out.println(e);

        //"1" ile increment

        int f = 12;
        f = f+1;
        f+=1;
        f++;//  "++ "  deyince 1 artır anlamına gelir...

        //"1" ile decrement

        int h = 10;
        h = h-1;
        h-=1;
        h--;// -- 1 eksilt anlamına gelir...

        //Post-increment ve pre- increment

        int i = 10;
        int k = i++;//Post increment, incrementle i variabldan sonra gelmiş
        System.out.println(k);//Post increment çünkü variable işleminden sonra yapıldı.
        System.out.println(i);//Burada i++ olduğu için i yeni değeri 11 olur ama k'nın değer 10 kalır.

        int m = 15;
        int n = ++m;//Pre increment, increment variabldan önce gelmiş..
        System.out.println(n);
        System.out.println(m);

        int p = 17;
        int r = p--;
        System.out.println(p);// p 16 olur
        System.out.println(r);// r 17 olur..

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

        /*
        1- Increment artırmak demektir, decrement azaltmak demektir.
        2- Increment toplama ve çarpma ile Decrement çıkarma ya da bölme ile yapılabilir.
        3- Increment ve decrement 3 yolla yapılabilir
         Increment
            a)  int i = 12; ==> i=i+5;
            b)  int i = 12; ==> i+=5;
            c)  int i = 12; ==> i++;
           Note: 3. yol sadece 1 artırmak için kullanılır.

           Decrement şu yollarla;
           a)  int i = 12; ==> i=i-5;
            b)  int i = 12; ==> i-=5;
            c)  int i = 12; ==> i--;
           Note: 3. yol sadece 1 eksiltmek için kullanılır.
         */




    }
}
