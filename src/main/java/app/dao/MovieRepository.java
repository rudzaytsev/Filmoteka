package app.dao;

import app.models.Movie;

import java.util.List;
import java.util.Map;

/**
 * Created by rudolph on 14.05.18.
 */
public interface MovieRepository {
  List<Movie> findMoviesBy(Map<String, String> filters);
}
