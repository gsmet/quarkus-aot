package fr.spacefox.perftests.quarkus.rest.endpoint694;

import fr.spacefox.perftests.quarkus.core.service694.Service694;
import fr.spacefox.perftests.quarkus.rest.endpoint694.schema.Schema694;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint694")
public class Endpoint694Resource {

    private final Service694 service;

    public Endpoint694Resource(Service694 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema694 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
