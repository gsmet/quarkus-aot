package fr.spacefox.perftests.quarkus.rest.endpoint159;

import fr.spacefox.perftests.quarkus.core.service159.Service159;
import fr.spacefox.perftests.quarkus.rest.endpoint159.schema.Schema159;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint159")
public class Endpoint159Resource {

    private final Service159 service;

    public Endpoint159Resource(Service159 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema159 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
