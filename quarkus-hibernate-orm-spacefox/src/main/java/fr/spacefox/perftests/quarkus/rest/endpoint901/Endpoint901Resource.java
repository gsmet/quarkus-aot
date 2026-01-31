package fr.spacefox.perftests.quarkus.rest.endpoint901;

import fr.spacefox.perftests.quarkus.core.service901.Service901;
import fr.spacefox.perftests.quarkus.rest.endpoint901.schema.Schema901;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint901")
public class Endpoint901Resource {

    private final Service901 service;

    public Endpoint901Resource(Service901 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema901 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
