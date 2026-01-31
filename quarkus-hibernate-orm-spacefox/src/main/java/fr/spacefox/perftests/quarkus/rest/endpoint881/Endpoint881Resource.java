package fr.spacefox.perftests.quarkus.rest.endpoint881;

import fr.spacefox.perftests.quarkus.core.service881.Service881;
import fr.spacefox.perftests.quarkus.rest.endpoint881.schema.Schema881;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint881")
public class Endpoint881Resource {

    private final Service881 service;

    public Endpoint881Resource(Service881 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema881 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
