package coreJava;

import java.util.Objects;

class Anime{
    String name;
    int jutsu;

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", jutsu=" + jutsu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return jutsu == anime.jutsu && Objects.equals(name, anime.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jutsu);
    }
}
public class objectClass {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.name = "itachi";
        anime.jutsu = 10000;

        Anime anime1 = new Anime();
        anime1.name = "itachi";
        anime1.jutsu = 10000;

        System.out.println(anime);
        System.out.println(anime1);

        boolean ans = anime1.equals(anime);
        System.out.println(ans);

        int i = anime1.hashCode();
        System.out.println(i);
    }
}
