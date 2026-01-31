package fr.spacefox.perftests.quarkus.rest.endpoint692;

import fr.spacefox.perftests.quarkus.core.service692.Service692;
import fr.spacefox.perftests.quarkus.rest.endpoint692.schema.Schema692;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint692")
public class Endpoint692Resource {

    private final Service692 service;

    public Endpoint692Resource(Service692 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema692 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
