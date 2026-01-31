package fr.spacefox.perftests.quarkus.rest.endpoint105;

import fr.spacefox.perftests.quarkus.core.service105.Service105;
import fr.spacefox.perftests.quarkus.rest.endpoint105.schema.Schema105;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint105")
public class Endpoint105Resource {

    private final Service105 service;

    public Endpoint105Resource(Service105 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema105 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
