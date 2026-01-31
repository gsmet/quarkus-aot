package fr.spacefox.perftests.quarkus.rest.endpoint450;

import fr.spacefox.perftests.quarkus.core.service450.Service450;
import fr.spacefox.perftests.quarkus.rest.endpoint450.schema.Schema450;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint450")
public class Endpoint450Resource {

    private final Service450 service;

    public Endpoint450Resource(Service450 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema450 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
