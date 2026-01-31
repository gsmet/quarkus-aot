package fr.spacefox.perftests.quarkus.rest.endpoint230;

import fr.spacefox.perftests.quarkus.core.service230.Service230;
import fr.spacefox.perftests.quarkus.rest.endpoint230.schema.Schema230;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint230")
public class Endpoint230Resource {

    private final Service230 service;

    public Endpoint230Resource(Service230 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema230 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
