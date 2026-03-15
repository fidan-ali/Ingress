package Task4;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    Queue<Customer> queue = new LinkedList<>();
    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.name + " added to queue");
    }

    public void serveCustomer() {
        if(queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer served = queue.poll();
        System.out.println("Serving: " + served.name);
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (Customer c : queue) {
            System.out.println(c);
        }
    }
}
