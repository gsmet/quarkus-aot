package fr.spacefox.perftests.quarkus.rest.endpoint435;

import fr.spacefox.perftests.quarkus.core.service435.Service435;
import fr.spacefox.perftests.quarkus.rest.endpoint435.schema.Schema435;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint435")
public class Endpoint435Resource {

    private final Service435 service;

    public Endpoint435Resource(Service435 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema435 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
