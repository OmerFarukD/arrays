import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //todo : Şehirlerin olduğu bir dizi oluşturup indexlerine göre ekrana çıktı veriniz.

        String[] sehirler = {"Adana","İstanbul","Ankara","Malatya","İzmir","Çanakkale","Edirne","Tekirdağ"};
//                                0       1          2        3         4        5
        // sehirler dizisinde Ankarayı bulup ekrana yazdırın
/*        System.out.println(sehirler[3]);
        System.out.println(sehirler.length);*/

        // döngüler
        // for döngsü


        // for (başlangıç noktası; bitiş noktası; kaçar kaçar artacak;)
/*        for (int i = 0;i< sehirler.length;i+=1){
            System.out.println(sehirler[i]);
        }*/
        // foreach yöntemi
/*
        for (String sehir :sehirler){
            System.out.println(sehir);
        }
*/

        // while döngüsü
/*        int i =0;
        while (i< sehirler.length){
            System.out.println(sehirler[i]);
            i+=1;
        }
        */
        // Listeler
        //ArrayList
        // todo: Ülekeler listesi oluşturunuz.
        List<String> countries = new ArrayList<>(List.of("Türkiye", "Almanya", "İngiltere", "Avusturya", "Macaristan","Macaristan"));

        System.out.println("bu liste boş mu :"+countries.isEmpty());
        System.out.println("2. İndexteki ülkeyi getir. :"+countries.get(2));
        System.out.println("Bu listede Fransa var mıdır ? "+countries.contains("Fransa"));
        System.out.println("Bu listede 3. İndexteki ülkenin adını Kanada yap"+countries.set(3,"Kanada"));
        System.out.println(countries.get(3));
        System.out.println("Macaristan ilk  kaçıncı indexte olduğunu bul :"+countries.indexOf("Macaristan"));
        System.out.println("Macaristan son kaçıncı indexte olduğunu bul :"+countries.lastIndexOf("Macaristan"));


  /*      for (String country : countries){
            System.out.println(country);
        }*/

        // 4. yöntem
        countries.forEach(country -> System.out.println(country));

        //5. Yöntem (Lmabda gösterimi)

        // Classın adı::çalıştırılacak metod
        countries.forEach(System.out::println);
    }

}