package app.models;


public class Movie {

  private Long id;
  private String name;
  private Integer year;
  private String genre;

  public Movie(Long id, String name, Integer year, String genre) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.genre = genre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Movie movie = (Movie) o;

    if (!id.equals(movie.id)) return false;
    if (!name.equals(movie.name)) return false;
    if (!year.equals(movie.year)) return false;
    return genre.equals(movie.genre);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + name.hashCode();
    result = 31 * result + year.hashCode();
    result = 31 * result + genre.hashCode();
    return result;
  }
}
