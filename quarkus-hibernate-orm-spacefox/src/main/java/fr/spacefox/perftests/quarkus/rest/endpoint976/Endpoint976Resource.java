package fr.spacefox.perftests.quarkus.rest.endpoint976;

import fr.spacefox.perftests.quarkus.core.service976.Service976;
import fr.spacefox.perftests.quarkus.rest.endpoint976.schema.Schema976;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint976")
public class Endpoint976Resource {

    private final Service976 service;

    public Endpoint976Resource(Service976 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema976 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
