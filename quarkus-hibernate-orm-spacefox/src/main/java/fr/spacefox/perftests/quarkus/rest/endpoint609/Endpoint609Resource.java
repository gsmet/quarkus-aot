package fr.spacefox.perftests.quarkus.rest.endpoint609;

import fr.spacefox.perftests.quarkus.core.service609.Service609;
import fr.spacefox.perftests.quarkus.rest.endpoint609.schema.Schema609;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint609")
public class Endpoint609Resource {

    private final Service609 service;

    public Endpoint609Resource(Service609 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema609 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
