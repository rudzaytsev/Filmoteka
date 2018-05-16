package app.dao;

import app.models.Movie;
import app.services.MovieService;
import app.services.SearchParams;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("prod")
@Service
public class ProdMovieService implements MovieService {

  @Override
  public List<Movie> findMoviesBy(SearchParams params) {
    return null;
  }
}
