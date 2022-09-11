public class filmManager {

    afisha[] films = new afisha[0];
    afisha[] filmsReverse = new afisha[0];
    int quantityFilms = 10;

    public filmManager(){
    }

    public filmManager (int quantityFilms){
        this.quantityFilms = quantityFilms;
    }

    public afisha[] getFilms() {
        return films;
    }

    public void setFilms (afisha[] films) {
        this.films = films;
    }

    public afisha[] getFilmsReverse() {
        return filmsReverse;
    }

    public void setFilmsReverse(afisha[] moviesReverse) {
        this.filmsReverse = filmsReverse;
    }
    public void add(afisha film) {
        afisha[] tmp = new afisha[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }
    public void findAll() {
        getFilms();
    }

    public void findLast() {
        if (quantityFilms > films.length) {
            quantityFilms = films.length;
        }
        afisha[] tmp = new afisha[quantityFilms];
        for (int i = 0, j = films.length - 1; i < quantityFilms; i++, j--) {
            tmp[i] = films[j];
        }
        filmsReverse = tmp;
    }

    }




