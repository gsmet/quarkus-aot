package fr.spacefox.perftests.quarkus.rest.endpoint569;

import fr.spacefox.perftests.quarkus.core.service569.Service569;
import fr.spacefox.perftests.quarkus.rest.endpoint569.schema.Schema569;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint569")
public class Endpoint569Resource {

    private final Service569 service;

    public Endpoint569Resource(Service569 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema569 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
