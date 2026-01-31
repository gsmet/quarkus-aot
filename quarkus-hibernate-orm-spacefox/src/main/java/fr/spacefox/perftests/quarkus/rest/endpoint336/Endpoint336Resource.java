package fr.spacefox.perftests.quarkus.rest.endpoint336;

import fr.spacefox.perftests.quarkus.core.service336.Service336;
import fr.spacefox.perftests.quarkus.rest.endpoint336.schema.Schema336;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint336")
public class Endpoint336Resource {

    private final Service336 service;

    public Endpoint336Resource(Service336 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema336 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
