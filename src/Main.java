import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MusicImpl musicImpl = new MusicImpl();

        while (true) {
            System.out.println("1. Musiqi elave et");
            System.out.println("2. Musiqi sil");
            System.out.println("3. Musiqi update");
            System.out.println("4. Musiqi get(Singer)");
            System.out.println("5. Musiqi getAll");
            System.out.println("6. çıx");

            System.out.print("Secim edin: ");
            int a = input.nextInt();

            switch (a) {
                case 1:
                    System.out.print("id daxil et: ");
                    int id = input.nextInt();
                    System.out.print("name daxil et: ");
                    String name = input.next();
                    System.out.print("singer Name daxil et: ");
                    String singerName = input.next();
                    System.out.print("status daxil et (true/false): ");
                    boolean isPremium = input.nextBoolean();

                    musicImpl.addMusic(new Music(id, name, singerName, isPremium));
                    break;
                case 2:
                    System.out.print("id daxil et: ");
                    id = input.nextInt();
                    musicImpl.deleteMusic(id);
                    break;
                case 3:
                    System.out.print("update edeceyin musiqin id-ni daxil et: ");
                    id = input.nextInt();
                    System.out.print("Yeni name daxil et: ");
                    name = input.next();
                    System.out.print(" Yeni singer Name daxil et: ");
                    singerName = input.next();
                    System.out.print("Yeni status daxil et (true/false): ");
                    isPremium = input.nextBoolean();
                    musicImpl.updateMusic(id, new Music(id, name, singerName, isPremium));
                    break;

                case 4:
                    System.out.print("singer daxil et: ");
                    String singer = input.next();
                    Music[] songs = musicImpl.getMusic(singer);
                    for (int i = 0; i < songs.length; i++) {
                        if (songs[i]!=null){
                            System.out.println(songs[i]);
                        }

                    }
                    break;
                case 5:
                    System.out.println("Butun musiqiler");
                    Music[] allSongs = musicImpl.getAllMusic();
                    for (int i = 0; i < allSongs.length; i++) {
                        if (allSongs[i] !=null){
                            System.out.println(allSongs[i]);
                        }

                    }
                    break;
                case 6:
                    System.out.println("Çıxış:");
                    input.close();
                    return;
                default:
                    System.out.println("Yanlis input");
            }

        }

    }
}