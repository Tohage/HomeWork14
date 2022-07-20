public class TicketsRepository {

    Ticket[] tickets = new Ticket[0];

    public void saveTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Ticket[] findAll() {
        return tickets;
    }

//    public Ticket[] findById(int findId) {
//        Ticket[] result = new Ticket[0];
//        for (Ticket product : findAll()) {
//            if (product.getIdTicket() == findId) {
//                Ticket[] tmp = new Ticket[result.length + 1];
//                System.arraycopy(findAll(), 0, tmp, 0, result.length);
//                int findIndex = 0;
//                tmp[findIndex] = product;
//                result = tmp;
//                return result;
//            }
//        }
//        return null;
//    }

    public Ticket[] removeById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int index = 0;
        for (Ticket item : tickets) {
            if (item.getIdTicket() != id) {
                tmp[index] = item;
                index++;
            }
        }
        tickets = tmp;
        return tmp;
    }
}