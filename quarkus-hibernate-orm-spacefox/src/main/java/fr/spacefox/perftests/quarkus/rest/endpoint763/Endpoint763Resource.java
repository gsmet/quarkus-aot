package fr.spacefox.perftests.quarkus.rest.endpoint763;

import fr.spacefox.perftests.quarkus.core.service763.Service763;
import fr.spacefox.perftests.quarkus.rest.endpoint763.schema.Schema763;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint763")
public class Endpoint763Resource {

    private final Service763 service;

    public Endpoint763Resource(Service763 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema763 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
