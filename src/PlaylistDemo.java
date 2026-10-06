import java.util.Scanner;

public class PlaylistDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- Testler ---");

        Track t1 = new Track();
        System.out.println("bos track:");
        System.out.println(t1);

        Track t2 = new Track("Neon Lights");
        System.out.println("sadece baslik:");
        System.out.println(t2);

        Track t3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + sanatci:");
        System.out.println(t3);

        Track full = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full track:");
        System.out.println(full);

        Track hataliSure = new Track("Broken Clock", "Static Noise", -50, false);
        System.out.println("eksi sure deneme: " + hataliSure);

        Track getTest = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("getterlar:");
        System.out.println("Title: " + getTest.getTitle());
        System.out.println("artist: " + getTest.getArtist());
        System.out.println("Sure: " + getTest.getDurationFormatted());
        System.out.println("explicit mi: " + getTest.getIsExplicit());
        System.out.println();

        while (true) {

            System.out.print("Başlık Giriniz: ");
            String baslik = input.nextLine();

            System.out.print("Sanatçı: ");
            String artist = input.nextLine();

            System.out.print("Süre Giriniz: ");
            int kacSn = input.nextInt();
            input.nextLine();

            System.out.print("Uygun Olmayan Kelime İçeriyor mu: ");
            String kufurVarMi = input.nextLine();
            kufurVarMi = kufurVarMi.toLowerCase();
            boolean varMi;

            switch (kufurVarMi){
                case "var":
                case "he":
                case "evet":
                    varMi = true;
                    break;

                default:
                    varMi = false;

            }

            System.out.print("Çıkmak istiyorsanız 0 giriniz: ");
            String isOut = input.nextLine();

            Track yeniSarki = new Track(baslik, artist, kacSn, varMi);
            System.out.println(yeniSarki);
            if(isOut.equals("0")){
                break;
            } else {continue;}


        }

    }
}