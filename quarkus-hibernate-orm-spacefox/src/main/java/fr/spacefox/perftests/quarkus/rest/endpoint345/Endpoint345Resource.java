package fr.spacefox.perftests.quarkus.rest.endpoint345;

import fr.spacefox.perftests.quarkus.core.service345.Service345;
import fr.spacefox.perftests.quarkus.rest.endpoint345.schema.Schema345;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint345")
public class Endpoint345Resource {

    private final Service345 service;

    public Endpoint345Resource(Service345 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema345 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
