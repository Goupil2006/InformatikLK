package OOP.Arztpraxis;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue(null, null);
        Patient patient1 = new Patient("Müller", "Hans", "01.01.1990", "AOK", "001");
        Patient patient2 = new Patient("Schmidt", "Peter", "01.01.2003", "DEBEKA", "002");
        Patient patient3 = new Patient("Meier", "Klaus", "01.01.2000", "Techniker", "003");
        queue.enqueue(patient1);
        queue.enqueue(patient2);
        System.out.println(queue.dequeue().toString());
        System.out.println(queue.toString());
        queue.enqueue(patient3);
        System.out.println(queue.toString());
        System.out.println(queue.dequeue().toString());
        System.out.println(queue.dequeue().toString());
        System.out.println(queue.toString());
    }
}
