package fr.spacefox.perftests.quarkus.rest.endpoint987;

import fr.spacefox.perftests.quarkus.core.service987.Service987;
import fr.spacefox.perftests.quarkus.rest.endpoint987.schema.Schema987;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint987")
public class Endpoint987Resource {

    private final Service987 service;

    public Endpoint987Resource(Service987 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema987 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
