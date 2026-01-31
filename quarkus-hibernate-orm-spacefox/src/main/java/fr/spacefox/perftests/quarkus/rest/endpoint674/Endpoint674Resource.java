package fr.spacefox.perftests.quarkus.rest.endpoint674;

import fr.spacefox.perftests.quarkus.core.service674.Service674;
import fr.spacefox.perftests.quarkus.rest.endpoint674.schema.Schema674;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint674")
public class Endpoint674Resource {

    private final Service674 service;

    public Endpoint674Resource(Service674 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema674 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
