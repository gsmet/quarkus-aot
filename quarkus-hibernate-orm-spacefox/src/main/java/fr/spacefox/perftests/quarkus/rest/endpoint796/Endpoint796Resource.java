package fr.spacefox.perftests.quarkus.rest.endpoint796;

import fr.spacefox.perftests.quarkus.core.service796.Service796;
import fr.spacefox.perftests.quarkus.rest.endpoint796.schema.Schema796;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint796")
public class Endpoint796Resource {

    private final Service796 service;

    public Endpoint796Resource(Service796 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema796 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
