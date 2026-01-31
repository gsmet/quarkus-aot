package fr.spacefox.perftests.quarkus.rest.endpoint201;

import fr.spacefox.perftests.quarkus.core.service201.Service201;
import fr.spacefox.perftests.quarkus.rest.endpoint201.schema.Schema201;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint201")
public class Endpoint201Resource {

    private final Service201 service;

    public Endpoint201Resource(Service201 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema201 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
