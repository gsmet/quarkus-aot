package fr.spacefox.perftests.quarkus.rest.endpoint638;

import fr.spacefox.perftests.quarkus.core.service638.Service638;
import fr.spacefox.perftests.quarkus.rest.endpoint638.schema.Schema638;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint638")
public class Endpoint638Resource {

    private final Service638 service;

    public Endpoint638Resource(Service638 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema638 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
