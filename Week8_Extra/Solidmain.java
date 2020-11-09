import java.lang.Math;
 abstract class Solid{
  double rad,height;
  Solid(double r,double h){
   rad=r;
   height=h;
  }
  abstract void find_area();
  abstract void find_volume();
 }
 class Cylinder extends Solid{
  Cylinder(double r,double h){
   super(r,h);
  }
  void find_area(){
   double area=2*Math.PI*rad*(rad+height);
   System.out.println("The area of the cylinder is "+area);
  }
  void find_volume(){
   double volume=Math.PI*Math.pow(rad,2)*height;
   System.out.println("The volume of the cylinder is "+volume);
  }
 }
 class Cone extends Solid{
  Cone(double r,double h){
   super(r,h);
  }
  void find_area(){
   double area=Math.PI*rad*height+Math.PI*Math.pow(rad,2);
   System.out.println("The area of the cone is "+area);
  }
  void find_volume(){
   double volume=Math.PI*(rad*rad)*height/3;
   System.out.println("The volume of the cone is "+volume);
  }
 }
 class Sphere extends Solid{
  Sphere(double r,double h){
   super(r,h);
  }
  void find_area(){
   double area=(4/3)*Math.PI*Math.pow(rad,2);
   System.out.println("The area of the sphere is "+area);
  }
  void find_volume(){
   double volume=4*Math.PI*Math.pow(rad,2);
   System.out.println("The volume of the sphere is "+volume);
  }
 }
class Solidmain{
 public static void main(String args[]){
  Cylinder cy=new Cylinder(3,4);
  Cone c=new Cone(5,4);
  Sphere sp=new Sphere(3,4);
  cy.find_area();
  cy.find_volume();
  c.find_area();
  c.find_volume();
  sp.find_area();
  sp.find_volume();
 }
}