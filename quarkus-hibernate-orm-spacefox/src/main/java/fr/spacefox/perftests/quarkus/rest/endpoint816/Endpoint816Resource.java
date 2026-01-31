package fr.spacefox.perftests.quarkus.rest.endpoint816;

import fr.spacefox.perftests.quarkus.core.service816.Service816;
import fr.spacefox.perftests.quarkus.rest.endpoint816.schema.Schema816;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint816")
public class Endpoint816Resource {

    private final Service816 service;

    public Endpoint816Resource(Service816 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema816 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
