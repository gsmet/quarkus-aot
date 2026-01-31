package fr.spacefox.perftests.quarkus.rest.endpoint175;

import fr.spacefox.perftests.quarkus.core.service175.Service175;
import fr.spacefox.perftests.quarkus.rest.endpoint175.schema.Schema175;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint175")
public class Endpoint175Resource {

    private final Service175 service;

    public Endpoint175Resource(Service175 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema175 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
