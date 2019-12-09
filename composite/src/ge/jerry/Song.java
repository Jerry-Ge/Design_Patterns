package ge.jerry;

public class Song extends SongComponent{
    String songName;
    String bandName;
    int releaseYear;

    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySongInfo()
    {
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear());
    }

}