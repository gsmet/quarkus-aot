package fr.spacefox.perftests.quarkus.rest.endpoint953;

import fr.spacefox.perftests.quarkus.core.service953.Service953;
import fr.spacefox.perftests.quarkus.rest.endpoint953.schema.Schema953;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint953")
public class Endpoint953Resource {

    private final Service953 service;

    public Endpoint953Resource(Service953 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema953 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
