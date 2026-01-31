package fr.spacefox.perftests.quarkus.rest.endpoint285;

import fr.spacefox.perftests.quarkus.core.service285.Service285;
import fr.spacefox.perftests.quarkus.rest.endpoint285.schema.Schema285;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint285")
public class Endpoint285Resource {

    private final Service285 service;

    public Endpoint285Resource(Service285 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema285 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
