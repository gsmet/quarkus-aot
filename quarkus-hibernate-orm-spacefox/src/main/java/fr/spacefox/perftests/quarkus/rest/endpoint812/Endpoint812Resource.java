package fr.spacefox.perftests.quarkus.rest.endpoint812;

import fr.spacefox.perftests.quarkus.core.service812.Service812;
import fr.spacefox.perftests.quarkus.rest.endpoint812.schema.Schema812;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint812")
public class Endpoint812Resource {

    private final Service812 service;

    public Endpoint812Resource(Service812 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema812 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
