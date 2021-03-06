public class Droid {
  int batteryLevel;
  String name;
//droid constructor
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
}

//toString method
  public String toString() {
    return "Hello, I am the droid " + name + "!";
  }

//perform task method
  public void performTask(String task) {
    System.out.println(name + " is performing the task: " + task);
    batteryLevel -= 10;
  }

//Recharge method
  public void recharge() {
    batteryLevel = 100;
  }

//energy report method
  public void energyReport() {
    System.out.println("This droid, " + name + ", battery level is " + batteryLevel);
  }

//main method
  public static void main(String[] args) {
  
    Droid codey = new Droid("Codey");
    Droid douglas = new Droid("Douglas");
    System.out.println(codey);
    codey.performTask("sneezing");
    codey.energyReport();
    codey.recharge();
    codey.energyReport();
    codey.performTask("crying");
    codey.energyReport();
    douglas.energyReport();
    
  }
}
