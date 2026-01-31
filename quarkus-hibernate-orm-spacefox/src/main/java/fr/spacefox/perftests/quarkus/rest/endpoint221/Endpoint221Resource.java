package fr.spacefox.perftests.quarkus.rest.endpoint221;

import fr.spacefox.perftests.quarkus.core.service221.Service221;
import fr.spacefox.perftests.quarkus.rest.endpoint221.schema.Schema221;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint221")
public class Endpoint221Resource {

    private final Service221 service;

    public Endpoint221Resource(Service221 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema221 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
