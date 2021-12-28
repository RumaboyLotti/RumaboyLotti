package GimmeLemons;
class Lamp {
  
    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
  
    // method to turn on the light
    void turnOn() {
      isOn = true;
      System.out.println("Light on? " + isOn);
  
    }
  
    // method to turnoff the light
    void turnOff() {
      isOn = false;
      System.out.println("Light on? " + isOn);
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      // create objects led and halogen
      Lamp led = new Lamp();
      Lamp halogen = new Lamp();
  
      // turn on the light by
      // calling method turnOn()
      led.turnOn();
  
      // turn off the light by
      // calling method turnOff()
      halogen.turnOff();
    }

    static class MethodOverloading {
        private static void display(int a){
            System.out.println("Arguments: " + a);
        }
    
        private static void display(int a, int b){
            System.out.println("Arguments: " + a + " and " + b);
        }
    
        public static void main(String[] args) {
            display(1);
            display(1, 4);
        }
    }

    static class HelperService {

        private String formatNumber(int value) {
            return String.format("%d", value);
        }
    
        private String formatNumber(double value) {
            return String.format("%.3f", value);
        }
    
        private String formatNumber(String value) {
            return String.format("%.2f", Double.parseDouble(value));
        }
    
        public static void main(String[] args) {
            HelperService hs = new HelperService();
            System.out.println(hs.formatNumber(500));
            System.out.println(hs.formatNumber(89.9934));
            System.out.println(hs.formatNumber("550"));
        }   
    }
  }