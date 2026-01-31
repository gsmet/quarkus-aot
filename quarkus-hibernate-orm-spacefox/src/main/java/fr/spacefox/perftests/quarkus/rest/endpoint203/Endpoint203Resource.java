package fr.spacefox.perftests.quarkus.rest.endpoint203;

import fr.spacefox.perftests.quarkus.core.service203.Service203;
import fr.spacefox.perftests.quarkus.rest.endpoint203.schema.Schema203;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint203")
public class Endpoint203Resource {

    private final Service203 service;

    public Endpoint203Resource(Service203 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema203 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
