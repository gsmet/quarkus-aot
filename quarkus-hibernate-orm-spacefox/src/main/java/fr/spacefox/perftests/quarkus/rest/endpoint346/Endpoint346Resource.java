package fr.spacefox.perftests.quarkus.rest.endpoint346;

import fr.spacefox.perftests.quarkus.core.service346.Service346;
import fr.spacefox.perftests.quarkus.rest.endpoint346.schema.Schema346;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint346")
public class Endpoint346Resource {

    private final Service346 service;

    public Endpoint346Resource(Service346 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema346 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
