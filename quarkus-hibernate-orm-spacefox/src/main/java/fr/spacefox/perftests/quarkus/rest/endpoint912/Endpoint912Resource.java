package fr.spacefox.perftests.quarkus.rest.endpoint912;

import fr.spacefox.perftests.quarkus.core.service912.Service912;
import fr.spacefox.perftests.quarkus.rest.endpoint912.schema.Schema912;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint912")
public class Endpoint912Resource {

    private final Service912 service;

    public Endpoint912Resource(Service912 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema912 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
