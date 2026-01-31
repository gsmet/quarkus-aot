package fr.spacefox.perftests.quarkus.rest.endpoint314;

import fr.spacefox.perftests.quarkus.core.service314.Service314;
import fr.spacefox.perftests.quarkus.rest.endpoint314.schema.Schema314;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint314")
public class Endpoint314Resource {

    private final Service314 service;

    public Endpoint314Resource(Service314 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema314 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
