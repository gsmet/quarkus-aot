package fr.spacefox.perftests.quarkus.rest.endpoint922;

import fr.spacefox.perftests.quarkus.core.service922.Service922;
import fr.spacefox.perftests.quarkus.rest.endpoint922.schema.Schema922;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint922")
public class Endpoint922Resource {

    private final Service922 service;

    public Endpoint922Resource(Service922 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema922 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
