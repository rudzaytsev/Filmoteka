package app.services;

import app.models.Movie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DemoMovieService implements MovieService {

  MovieRepository repository;

  @Override
  public List<Movie> findMoviesBy(Map<String, String> parameters) {
    return null;
  }
}
