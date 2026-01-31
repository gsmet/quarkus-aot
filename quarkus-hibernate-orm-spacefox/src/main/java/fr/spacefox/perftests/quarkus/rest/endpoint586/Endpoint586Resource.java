package fr.spacefox.perftests.quarkus.rest.endpoint586;

import fr.spacefox.perftests.quarkus.core.service586.Service586;
import fr.spacefox.perftests.quarkus.rest.endpoint586.schema.Schema586;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint586")
public class Endpoint586Resource {

    private final Service586 service;

    public Endpoint586Resource(Service586 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema586 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
