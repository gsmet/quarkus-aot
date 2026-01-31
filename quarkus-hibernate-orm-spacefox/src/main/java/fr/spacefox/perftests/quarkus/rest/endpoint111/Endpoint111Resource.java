package fr.spacefox.perftests.quarkus.rest.endpoint111;

import fr.spacefox.perftests.quarkus.core.service111.Service111;
import fr.spacefox.perftests.quarkus.rest.endpoint111.schema.Schema111;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint111")
public class Endpoint111Resource {

    private final Service111 service;

    public Endpoint111Resource(Service111 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema111 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
