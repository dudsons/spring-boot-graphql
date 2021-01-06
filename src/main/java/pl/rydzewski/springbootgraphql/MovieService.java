package pl.rydzewski.springbootgraphql;

import org.springframework.stereotype.Service;
import pl.rydzewski.springbootgraphql.dao.Movie;
import pl.rydzewski.springbootgraphql.dao.MovieRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> getMovies (int limit){
        return movieRepo.findAll()
                .stream()
                .limit(limit)
                .collect(Collectors.toList());

    }

    public Movie addMovie(String author, String url){
        return movieRepo.save(new Movie(author,url));
    }
}
