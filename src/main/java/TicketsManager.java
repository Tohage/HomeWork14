import java.util.Arrays;

public class TicketsManager {

    private TicketsRepository repository = new TicketsRepository();

public void addTicket (Ticket ticket){
    repository.saveTicket(ticket);
}
    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.tickets) {
            if (ticket.getAirportDeparture() == from && ticket.getAirportArrival() == to) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }


}
