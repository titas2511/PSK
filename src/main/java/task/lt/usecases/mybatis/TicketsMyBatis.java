package task.lt.usecases.mybatis;

import lombok.Getter;
import lombok.Setter;
import task.lt.mybatis.dao.TicketMapper;
import task.lt.mybatis.model.Ticket;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
@Getter @Setter
public class TicketsMyBatis implements Serializable {
    @Inject
    private TicketMapper ticketMapper;

    @Getter @Setter
    private List<Ticket> allTickets;

    @Getter @Setter
    private Ticket ticketToCreate = new Ticket();

    public void loadTrips() {
        this.allTickets = ticketMapper.selectAllWithTrip();
    }

    @PostConstruct
    public void init() {
        this.loadTrips();
    }

    @Transactional
    public String createTicket(){
        this.ticketMapper.insert(ticketToCreate);
        return "/mybatis/ticket?faces-redirect=true";
    }
}
