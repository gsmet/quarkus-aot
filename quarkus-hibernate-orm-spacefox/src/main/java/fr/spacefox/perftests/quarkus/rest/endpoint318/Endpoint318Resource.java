package fr.spacefox.perftests.quarkus.rest.endpoint318;

import fr.spacefox.perftests.quarkus.core.service318.Service318;
import fr.spacefox.perftests.quarkus.rest.endpoint318.schema.Schema318;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint318")
public class Endpoint318Resource {

    private final Service318 service;

    public Endpoint318Resource(Service318 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema318 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
