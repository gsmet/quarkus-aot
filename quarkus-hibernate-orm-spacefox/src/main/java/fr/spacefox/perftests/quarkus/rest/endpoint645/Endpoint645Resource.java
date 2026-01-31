package fr.spacefox.perftests.quarkus.rest.endpoint645;

import fr.spacefox.perftests.quarkus.core.service645.Service645;
import fr.spacefox.perftests.quarkus.rest.endpoint645.schema.Schema645;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint645")
public class Endpoint645Resource {

    private final Service645 service;

    public Endpoint645Resource(Service645 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema645 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
