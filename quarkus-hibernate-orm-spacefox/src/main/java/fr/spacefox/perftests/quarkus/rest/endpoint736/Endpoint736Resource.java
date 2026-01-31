package fr.spacefox.perftests.quarkus.rest.endpoint736;

import fr.spacefox.perftests.quarkus.core.service736.Service736;
import fr.spacefox.perftests.quarkus.rest.endpoint736.schema.Schema736;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint736")
public class Endpoint736Resource {

    private final Service736 service;

    public Endpoint736Resource(Service736 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema736 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
