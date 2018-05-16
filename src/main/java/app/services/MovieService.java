package app.services;

import app.models.Movie;

import java.util.List;

public interface MovieService {

  List<Movie> findMoviesBy(SearchParams params);

}
