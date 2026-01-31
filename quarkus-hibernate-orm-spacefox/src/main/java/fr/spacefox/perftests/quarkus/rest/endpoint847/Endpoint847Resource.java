package fr.spacefox.perftests.quarkus.rest.endpoint847;

import fr.spacefox.perftests.quarkus.core.service847.Service847;
import fr.spacefox.perftests.quarkus.rest.endpoint847.schema.Schema847;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint847")
public class Endpoint847Resource {

    private final Service847 service;

    public Endpoint847Resource(Service847 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema847 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
