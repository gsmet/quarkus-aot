package fr.spacefox.perftests.quarkus.rest.endpoint190;

import fr.spacefox.perftests.quarkus.core.service190.Service190;
import fr.spacefox.perftests.quarkus.rest.endpoint190.schema.Schema190;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint190")
public class Endpoint190Resource {

    private final Service190 service;

    public Endpoint190Resource(Service190 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema190 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
