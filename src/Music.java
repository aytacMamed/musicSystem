public class Music {
    private int id;
    private String name;
    private String singerName;
    private boolean isPremium;

    public Music(int id, String name, String singerName, boolean isPremium) {
        this.id = id;
        this.name = name;
        this.singerName = singerName;
        this.isPremium = isPremium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singerName='" + singerName + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }
}
