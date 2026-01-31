package fr.spacefox.perftests.quarkus.rest.endpoint917;

import fr.spacefox.perftests.quarkus.core.service917.Service917;
import fr.spacefox.perftests.quarkus.rest.endpoint917.schema.Schema917;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint917")
public class Endpoint917Resource {

    private final Service917 service;

    public Endpoint917Resource(Service917 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema917 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
