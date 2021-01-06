package pl.rydzewski.springbootgraphql.ql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import pl.rydzewski.springbootgraphql.MovieService;
import pl.rydzewski.springbootgraphql.dao.Movie;

import java.util.List;

@Component
public class MovieQuery implements GraphQLQueryResolver {

    private MovieService movieService;

    public MovieQuery(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<Movie> getMovies(int limit){
        return movieService.getMovies(limit);
    }
}
