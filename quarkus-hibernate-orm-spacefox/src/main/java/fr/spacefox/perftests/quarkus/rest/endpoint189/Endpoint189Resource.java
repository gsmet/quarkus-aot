package fr.spacefox.perftests.quarkus.rest.endpoint189;

import fr.spacefox.perftests.quarkus.core.service189.Service189;
import fr.spacefox.perftests.quarkus.rest.endpoint189.schema.Schema189;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint189")
public class Endpoint189Resource {

    private final Service189 service;

    public Endpoint189Resource(Service189 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema189 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
