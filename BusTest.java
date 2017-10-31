import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest{

  Bus bus;
  Passengers passengers;

  @Before
  public void before(){
    this.bus = new Bus("Edinburgh", 33);
    this.passengers = new Passengers();
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
  public void busStartsEmpty(){
    assertEquals(0, bus.personCount());
  }

  // @Test
  // public void passengersJoin(){
  //   bus.join(passengers);
  //   assertEquals(1, personCount());
  // }
}
