import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest{

  Bus bus;
  Passengers passengers;
  Route route;

  @Before
  public void before(){
    this.bus = new Bus("Edinburgh", 33);
    this.passengers = new Passengers();
    this.route = route();
  }
  @Test
  public void hasName(){
    String route = bus.getRoute();
    assertEquals("Edinburgh", route);
  }
  @Test
  public void hasRouteNumber(){
    int routeNumber = bus.getRouteNumber();
    assertEquals(33, routeNumber);
  }
  @Test
  public void setRoute(String newroute){
    this.route = route();
  }

}
