import java.util.Scanner;
abstract class EnergySource {
   
   int id;
   String name;
   double energy;
   
   EnergySource(int id, String name,double energy){
      this.id=id;
      this.name=name;
      this.energy=energy;
      }
   abstract double calculateEfficiency();
   
   void display(){
   System.out.println("Energy Source Details are:");
   System.out.println("ID:"+id);
   System.out.println("Name:"+name);
   System.out.println("Energy:"+energy+"kwh");
   }
}

class SolarEnergy extends EnergySource{
   
      SolarEnergy(int id, String name, double energy){
         super(id, name, energy);
      }
      double calculateEfficiency(){
         return(energy/5000*100);
      }
}


class WindEnergy extends EnergySource{
   
      WindEnergy(int id, String name, double energy){
         super(id, name, energy);
      }
      double calculateEfficiency(){
         return(energy/8000*100);
      }
}

public class Test{
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      EnergySource e;
      
      
      System.out.println("Enter Details for Solar Energy:");
      
      System.out.println("Enter Source ID:");
      int id=Integer.parseInt(sc.nextLine());
      
      System.out.println("Enter Source Name:");
      String name=sc.nextLine();
      
      System.out.println("Enter Energy Generated:");
      double energy=Integer.parseInt(sc.nextLine());
      
      e= new SolarEnergy(id,name,energy);
      e.display();
      System.out.println("Efficiency of Solar Panel:"+e.calculateEfficiency()+"%");
      
      System.out.println("---------------------------------------------------------");
      
      System.out.println("Enter Details for Wind Energy:");
      
      System.out.println("Enter Source ID:");
      id=Integer.parseInt(sc.nextLine());
      
      System.out.println("Enter Source Name:");
      name=sc.nextLine();
      
      System.out.println("Enter Energy Generated:");
      energy=Integer.parseInt(sc.nextLine());
      
      
      e= new SolarEnergy(id,name,energy);
      e.display();
      System.out.println("Efficiency of Wind Turbines:"+e.calculateEfficiency()+"%");
}
}