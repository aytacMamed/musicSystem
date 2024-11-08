public class MusicImpl implements MusicService{
    Music[] musicArray=new Music[100];
    // 0 1 2 3 4 5 6 ...
    int count=0;

    @Override
    public void addMusic(Music music) {
        if (count<musicArray.length){
            musicArray[count++]=music;
            System.out.println("Array-e music elave olundu");
        }
        else {
            System.out.println("array doludur");
        }
    }

    @Override
    public void deleteMusic(int id) {
        //
        for (int i=0; i<count;i++){
            if (musicArray[i].getId()==id){
                musicArray[count-1]=null;
                count--;
                System.out.println("musiqi silindi");
                return;
            }
        }
        System.out.println("musiqi tapilmadi");
    }

    @Override
    public void updateMusic(int id, Music music) {
        for (int i=0;i<count;i++){
            if (musicArray[i].getId()==id){
                musicArray[i]=music;
                System.out.println("update olundu");
                return;
            }
        }
        System.out.println("musiqi tapilmadi");
    }

    @Override
    public Music[] getMusic(String singerName) {
        Music[] singerArray=new Music[count];
       int count1=0;

       for (int i=0;i<count;i++){
           if (musicArray[i].getSingerName().equalsIgnoreCase(singerName)){
               singerArray[count1++]=musicArray[i];
           }
       }
       return singerArray;
    }

    @Override
    public Music[] getAllMusic() {
        return musicArray;
    }
}

