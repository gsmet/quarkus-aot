package fr.spacefox.perftests.quarkus.rest.endpoint25;

import fr.spacefox.perftests.quarkus.core.service25.Service25;
import fr.spacefox.perftests.quarkus.rest.endpoint25.schema.Schema25;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint25")
public class Endpoint25Resource {

    private final Service25 service;

    public Endpoint25Resource(Service25 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema25 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
