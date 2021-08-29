
class point(x:Double, y:Double){
  def dx:Double=x;
  def dy:Double=y;
  
  //Q2  move should move a point by a given distance dx and dy
  def move(dx:Double=0,dy:Double=0) = new point( this.dx+dx,this.dy+dy);
  
  //Q4   invert should switch the x and y coordinates.
  def invert()=new point(this.dy,this.dx);
  
  override def toString="("+dx+","+dy+")";
}


object Q1 extends App{
  
  val p1=new point(1,2);
  val p2=new point(3,4);
 
  //Q1  add(+) should add two given points(p1,p2)
  def add(p1:point,p2:point) = new point( p1.dx+p2.dx,p1.dy+p2.dy);
  //Q3   distance should return the distance between two given points (p1,p2)
  def distance(p1:point,p2:point) =  new point((scala.math.sqrt(scala.math.pow((p1.dx-p2.dx),2)+scala.math.pow((p1.dy-p2.dy),2))),0);
 
  
  println("Add of (1,2) (3,4) --> "+add(p1,p2));
  println("move p1 by (3,0) --> "+p1.move(3));
  println("distance of (1,2) (3,4) --> "+distance(p1,p2).dx);
  println("Invert of (1,2) --> "+p1.invert());
}