public class TicketDriver {
    public static void main(String[] args) {
        Advance advTicket = new Advance(10);
        StudentAdvance sAdvTicket = new StudentAdvance(8);
        
        System.out.println("Ticket test:");
        System.out.println("AdvTicket: "+advTicket);
        System.out.println("sAdvTicket: "+sAdvTicket);
    }
}