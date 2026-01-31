package fr.spacefox.perftests.quarkus.rest.endpoint37;

import fr.spacefox.perftests.quarkus.core.service37.Service37;
import fr.spacefox.perftests.quarkus.rest.endpoint37.schema.Schema37;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint37")
public class Endpoint37Resource {

    private final Service37 service;

    public Endpoint37Resource(Service37 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema37 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
