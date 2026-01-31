package fr.spacefox.perftests.quarkus.rest.endpoint714;

import fr.spacefox.perftests.quarkus.core.service714.Service714;
import fr.spacefox.perftests.quarkus.rest.endpoint714.schema.Schema714;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint714")
public class Endpoint714Resource {

    private final Service714 service;

    public Endpoint714Resource(Service714 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema714 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
