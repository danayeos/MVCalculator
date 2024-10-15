import java.util.List;

// Итератор для фильмов, хранящихся в списке
public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;
    private int position = 0;

    public ListMovieIterator(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return movies.get(position++);
        }
        return null;
    }
}

