package app.services;

public class SearchParams {

  private String name;
  private String genre;
  private Integer fromYear;
  private Integer toYear;

  public Integer getFromYear() {
    return fromYear;
  }

  public void setFromYear(Integer fromYear) {
    this.fromYear = fromYear;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Integer getToYear() {
    return toYear;
  }

  public void setToYear(Integer toYear) {
    this.toYear = toYear;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SearchParams params = (SearchParams) o;

    if (fromYear != null ? !fromYear.equals(params.fromYear) : params.fromYear != null) return false;
    if (genre != null ? !genre.equals(params.genre) : params.genre != null) return false;
    if (name != null ? !name.equals(params.name) : params.name != null) return false;
    if (toYear != null ? !toYear.equals(params.toYear) : params.toYear != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (genre != null ? genre.hashCode() : 0);
    result = 31 * result + (fromYear != null ? fromYear.hashCode() : 0);
    result = 31 * result + (toYear != null ? toYear.hashCode() : 0);
    return result;
  }
}
