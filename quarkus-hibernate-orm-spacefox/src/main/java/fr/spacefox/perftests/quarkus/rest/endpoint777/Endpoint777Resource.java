package fr.spacefox.perftests.quarkus.rest.endpoint777;

import fr.spacefox.perftests.quarkus.core.service777.Service777;
import fr.spacefox.perftests.quarkus.rest.endpoint777.schema.Schema777;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint777")
public class Endpoint777Resource {

    private final Service777 service;

    public Endpoint777Resource(Service777 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema777 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
