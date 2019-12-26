# AviQuery


 this is a laibrary that wrap the java stream api and provid a better way to manage list with syntax similar to sql select query and c# linq query.
 for example:
 <pre>
 public class Vehicle{
      private int id;
      private String model;
      private String plateNumber;
      private boolean sold;
      
      //costractros
      //getters and setters
 }
</pre>
 <pre>

list of Vehicles: List&lsaquo;Vehicle&rsaquo; vehicles
  </pre>

  Query.from(vehicles)<br/>
&emsp;&emsp;.select(Vehicle::getModel)<br/>
&emsp;&emsp;.where(e->e.getId()==5)<br/>
&emsp;&emsp;.orderBy(Vehicle::getPlateNumber, Ordered.DESC)<br/>
&emsp;&emsp;.toList();<br/>
