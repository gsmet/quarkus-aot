package fr.spacefox.perftests.quarkus.rest.endpoint738;

import fr.spacefox.perftests.quarkus.core.service738.Service738;
import fr.spacefox.perftests.quarkus.rest.endpoint738.schema.Schema738;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint738")
public class Endpoint738Resource {

    private final Service738 service;

    public Endpoint738Resource(Service738 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema738 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
