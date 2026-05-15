package Application;

public class Ticket {
    private int tickets;
    private Points points;
    private Usuario usuario;

    public Ticket(int tickets, Points points, Usuario usuario) {
        this.tickets = tickets;
        this.points = points;
        this.usuario = usuario;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Points getPoints() {
        return points;
    }

    public void setPoints(Points points) {
        this.points = points;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

