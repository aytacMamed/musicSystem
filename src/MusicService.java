public interface MusicService {
    //add --> music elave et (array)-->return or void
    void addMusic(Music music);
    //delete-->silir(array)-->return or void
    void deleteMusic(int id);
    void updateMusic(int id,Music music);
    //get--> return
    Music[] getMusic(String singerName);
    Music[] getAllMusic();

}
