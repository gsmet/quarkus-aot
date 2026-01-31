package fr.spacefox.perftests.quarkus.rest.endpoint575;

import fr.spacefox.perftests.quarkus.core.service575.Service575;
import fr.spacefox.perftests.quarkus.rest.endpoint575.schema.Schema575;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint575")
public class Endpoint575Resource {

    private final Service575 service;

    public Endpoint575Resource(Service575 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema575 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
