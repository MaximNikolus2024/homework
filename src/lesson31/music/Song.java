package lesson31.music;

public class Song {
    //Разработать класс Песня. Определить поля название, имя исполнителя и длительность.
    //
    //Переопределить toString таким образом, чтобы он выводил песню в таком формате:
    //
    //<исполнитель> - <название> (<длительность>)
    //
    //Например: The Weekend - Blinding lights (3:20)
    //
    //Естественно, что длительность нужно сохранить в секундах, а выводить в минутах и секундах.
    private String nameOfSong;
    private String authorName;
    private int duration;

    public Song(String nameOfSong, String authorName, int duration) {
        this.nameOfSong = nameOfSong;
        this.authorName = authorName;
        this.duration = duration;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString(){
        return "Author: " + this.authorName
                + "Name of song: " + this.nameOfSong
                + "Duration " + this.duration;
    }
}
