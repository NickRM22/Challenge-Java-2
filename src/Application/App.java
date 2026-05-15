package Application;

public class App {
    private Usuario usuario;
    private Points points;
    private Ticket ticket;

    public App(Usuario usuario, Points points, Ticket ticket) {
        this.usuario = usuario;
        this.points = points;
        this.ticket = ticket;
    }

    public void conversionViewsForPoints() {
        if (usuario.getViewMinutes() >= 180) {
            points.setPoints(points.getPoints() + usuario.getViewMinutes() / 180);
            usuario.setViewMinutes(usuario.getViewMinutes() % 180);
        }

    }

    public void conversionPointsToTickets() {
        if (points.getPoints() >= 10) {
            ticket.setTickets(ticket.getTickets() + points.getPoints() / 10);
            points.setPoints(points.getPoints() % 10);
        }
    }
}

