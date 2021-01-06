package pl.rydzewski.springbootgraphql.ql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import pl.rydzewski.springbootgraphql.MovieService;
import pl.rydzewski.springbootgraphql.dao.Movie;

@Component
public class MovieMutation implements GraphQLMutationResolver {

    private MovieService movieService;

    public MovieMutation(MovieService movieService) {
        this.movieService = movieService;
    }

    public Movie addMovie(String author, String url){
        return movieService.addMovie(author,url);
    }

}
