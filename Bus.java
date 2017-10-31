class Bus{
  private String route;
  private int routeNumber;
  private Passengers[] person;

  public Bus(String route, int routeNumber){
    this.route = route;
    this.routeNumber = routeNumber;
    this.person = new Passengers[10];
  }

  public String getRoute(){
    return this.route;
  }
  public int getRouteNumber(){
    return this.routeNumber;
  }
  public int personCount(){
    int count = 0;
    for(Passengers passengers : person){
      if(passengers != null){
        count++;
      }
    }
    return count;
  }
}
