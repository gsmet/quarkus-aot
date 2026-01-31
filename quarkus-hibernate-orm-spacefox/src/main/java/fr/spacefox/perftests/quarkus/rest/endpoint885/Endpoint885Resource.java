package fr.spacefox.perftests.quarkus.rest.endpoint885;

import fr.spacefox.perftests.quarkus.core.service885.Service885;
import fr.spacefox.perftests.quarkus.rest.endpoint885.schema.Schema885;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint885")
public class Endpoint885Resource {

    private final Service885 service;

    public Endpoint885Resource(Service885 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema885 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
