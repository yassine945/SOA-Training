package webservices;
import entities.UniteEnseignement;
import metiers.UniteEnseignementBusiness;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.awt.*;


public class UnitEnsRestApi {
UniteEnseignementBusiness helper = new UniteEnseignementBusiness();
@Path("/list")
    @GET
    Produces(MediaType.APPLICATION)
}
