package fr.spacefox.perftests.quarkus.rest.endpoint932;

import fr.spacefox.perftests.quarkus.core.service932.Service932;
import fr.spacefox.perftests.quarkus.rest.endpoint932.schema.Schema932;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint932")
public class Endpoint932Resource {

    private final Service932 service;

    public Endpoint932Resource(Service932 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema932 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
