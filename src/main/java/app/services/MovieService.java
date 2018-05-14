package app.services;

import app.models.Movie;

import java.util.List;
import java.util.Map;

public interface MovieService {

  List<Movie> findMoviesBy(Map<String, String> parameters);


}
