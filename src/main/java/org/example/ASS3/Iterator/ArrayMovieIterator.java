// Итератор для фильмов, хранящихся в массиве
public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position = 0;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return movies[position++];
        }
        return null;
    }
}

