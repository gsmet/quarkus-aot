package fr.spacefox.perftests.quarkus.rest.endpoint930;

import fr.spacefox.perftests.quarkus.core.service930.Service930;
import fr.spacefox.perftests.quarkus.rest.endpoint930.schema.Schema930;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint930")
public class Endpoint930Resource {

    private final Service930 service;

    public Endpoint930Resource(Service930 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema930 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
