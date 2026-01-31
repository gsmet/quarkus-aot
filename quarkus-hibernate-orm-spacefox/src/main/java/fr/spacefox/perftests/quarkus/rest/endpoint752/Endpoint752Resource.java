package fr.spacefox.perftests.quarkus.rest.endpoint752;

import fr.spacefox.perftests.quarkus.core.service752.Service752;
import fr.spacefox.perftests.quarkus.rest.endpoint752.schema.Schema752;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint752")
public class Endpoint752Resource {

    private final Service752 service;

    public Endpoint752Resource(Service752 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema752 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
