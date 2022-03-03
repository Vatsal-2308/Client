import java.util.ArrayList;
import java.util.List;

public class BoxOfficeMovieResponse {
    List<Movie> movies;

    // public constructor is necessary for collections
    public BoxOfficeMovieResponse() {
        movies = new ArrayList<Movie>();
    }

}
