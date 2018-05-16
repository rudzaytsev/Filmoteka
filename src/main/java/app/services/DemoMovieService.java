package app.services;

import app.dao.MovieRepository;
import app.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Profile({"demo", "test"})
@Service
public class DemoMovieService implements MovieService {

  @Autowired
  MovieRepository repository;

  @Override
  public List<Movie> findMoviesBy(SearchParams params) {
    Map<String, String> filters = getSelectedParams(params);
    return repository.findMoviesBy(filters);
  }

  Map<String, String> getSelectedParams(SearchParams params) {
    HashMap<String, String> selectedParams = new HashMap<>();
    String name = params.getName();
    if (name != null && !name.isEmpty()) {
      selectedParams.put("name", name);
    }
    String genre = params.getGenre();
    if (genre != null && !genre.equalsIgnoreCase("NOT_SELECTED")) {
      selectedParams.put("genre", genre);
    }
    Integer fromYear = params.getFromYear();
    if (fromYear != null) {
      selectedParams.put("fromYear", fromYear.toString());
    }
    Integer toYear = params.getToYear();
    if (toYear != null) {
      selectedParams.put("toYear", toYear.toString());
    }
    return selectedParams;
  }
}
