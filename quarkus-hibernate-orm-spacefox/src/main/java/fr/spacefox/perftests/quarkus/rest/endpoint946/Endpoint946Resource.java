package fr.spacefox.perftests.quarkus.rest.endpoint946;

import fr.spacefox.perftests.quarkus.core.service946.Service946;
import fr.spacefox.perftests.quarkus.rest.endpoint946.schema.Schema946;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint946")
public class Endpoint946Resource {

    private final Service946 service;

    public Endpoint946Resource(Service946 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema946 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
