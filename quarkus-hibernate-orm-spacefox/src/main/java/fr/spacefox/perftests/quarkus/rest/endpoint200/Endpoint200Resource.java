package fr.spacefox.perftests.quarkus.rest.endpoint200;

import fr.spacefox.perftests.quarkus.core.service200.Service200;
import fr.spacefox.perftests.quarkus.rest.endpoint200.schema.Schema200;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint200")
public class Endpoint200Resource {

    private final Service200 service;

    public Endpoint200Resource(Service200 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema200 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
