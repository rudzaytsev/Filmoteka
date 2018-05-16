package app.services;

import app.conf.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@ActiveProfiles(profiles = {"test"})
public class DemoMovieServiceTest {

  @Autowired
  private DemoMovieService service;


  @Test
  public void onlyParamsSelectedByUserShouldBePresentInMap() {
    SearchParams params = new SearchParams();
    params.setName("The Matrix");
    params.setGenre("NOT_SELECTED");
    params.setFromYear(1992);
    Map<String, String> result = service.getSelectedParams(params);

    assertEquals("The Matrix", result.get("name"));
    assertEquals("1992", result.get("fromYear"));
    assertFalse(result.keySet().contains("toYear"));
    assertFalse(result.keySet().contains("genre"));
    assertFalse(result.values().contains("NOT_SELECTED"));
  }
}