package solve_problems.Java_class_Anudhip;
public class Interface_concept {
    interface RemoteControl {
        void turnOn();
        void turnOff();
    }
    static class TV implements RemoteControl {
        public void turnOn() {
            System.out.println("TV is ON");
        }
        public void turnOff() {
            System.out.println("TV is OFF");
        }
    }
    static class AC implements RemoteControl {
        public void turnOn() {
            System.out.println("AC is ON");
        }
        public void turnOff() {
            System.out.println("AC is OFF");
        }
    }
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl ac = new AC();
        tv.turnOn();
        tv.turnOff();
        ac.turnOn();
        ac.turnOff();
    }
}