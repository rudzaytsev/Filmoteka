package app.dao;

import app.models.Movie;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Profile({"demo", "test"})
@Repository
public class DemoMovieRepository implements MovieRepository {
  @Override
  public List<Movie> findMoviesBy(Map<String, String> filters) {
    return null;
  }
}
