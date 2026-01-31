package fr.spacefox.perftests.quarkus.rest.endpoint87;

import fr.spacefox.perftests.quarkus.core.service87.Service87;
import fr.spacefox.perftests.quarkus.rest.endpoint87.schema.Schema87;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint87")
public class Endpoint87Resource {

    private final Service87 service;

    public Endpoint87Resource(Service87 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema87 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
