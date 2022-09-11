import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class filmManagerTest {

    afisha film1 = new afisha(1, "Бладшот");
    afisha film2 = new afisha(2, "Вперед");
    afisha film3 = new afisha(3, "Отель Белград");
    afisha film4 = new afisha(4, "Джентельмены");
    afisha film5 = new afisha(5, "Человек-неведимка");
    afisha film6 = new afisha(5, "Тролли");
    afisha film7 = new afisha(5, "Номер один");
    afisha film8 = new afisha(5, "Бетховен");
    afisha film9 = new afisha(5, "Один дома");
    afisha film10 = new afisha(5, "Тачки");
    afisha film11 = new afisha(5, "Такси");

    filmManager repo = new filmManager();
    filmManager repo7 = new filmManager(7);
    
    @Test
    public void shouldAddFiveFilms() {
        repo.add(film1);
        repo.add(film2);
        repo.add(film3);
        repo.add(film4);
        repo.add(film5);

        afisha[] expected = {film1, film2, film3, film4, film5};
        afisha[] actual = repo.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFiveMovies() {
        afisha[] expected = {film1, film2, film3, film4, film5};
        afisha[] findFive = {film1, film2, film3, film4, film5};
        repo.setFilms(findFive);
        repo.findAll();
        afisha[] actual = repo.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindLastFiveMoviesCountSeven() {
        afisha[] expected = {film5, film4, film3, film2, film1};
        afisha[] findFive = {film1, film2, film3, film4, film5};
repo7.setFilms(findFive);
repo7.findLast();
        Assertions.assertArrayEquals(expected, repo7.getFilmsReverse());
    }
}
