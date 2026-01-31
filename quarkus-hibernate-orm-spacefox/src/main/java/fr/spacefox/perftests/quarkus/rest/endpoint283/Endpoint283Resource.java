package fr.spacefox.perftests.quarkus.rest.endpoint283;

import fr.spacefox.perftests.quarkus.core.service283.Service283;
import fr.spacefox.perftests.quarkus.rest.endpoint283.schema.Schema283;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint283")
public class Endpoint283Resource {

    private final Service283 service;

    public Endpoint283Resource(Service283 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema283 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
