package fr.spacefox.perftests.quarkus.rest.endpoint647;

import fr.spacefox.perftests.quarkus.core.service647.Service647;
import fr.spacefox.perftests.quarkus.rest.endpoint647.schema.Schema647;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint647")
public class Endpoint647Resource {

    private final Service647 service;

    public Endpoint647Resource(Service647 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema647 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
