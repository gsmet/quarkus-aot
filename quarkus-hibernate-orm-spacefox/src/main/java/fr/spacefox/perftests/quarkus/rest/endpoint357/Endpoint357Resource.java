package fr.spacefox.perftests.quarkus.rest.endpoint357;

import fr.spacefox.perftests.quarkus.core.service357.Service357;
import fr.spacefox.perftests.quarkus.rest.endpoint357.schema.Schema357;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint357")
public class Endpoint357Resource {

    private final Service357 service;

    public Endpoint357Resource(Service357 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema357 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
