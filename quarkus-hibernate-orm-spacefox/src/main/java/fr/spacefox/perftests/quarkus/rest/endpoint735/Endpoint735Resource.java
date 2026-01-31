package fr.spacefox.perftests.quarkus.rest.endpoint735;

import fr.spacefox.perftests.quarkus.core.service735.Service735;
import fr.spacefox.perftests.quarkus.rest.endpoint735.schema.Schema735;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint735")
public class Endpoint735Resource {

    private final Service735 service;

    public Endpoint735Resource(Service735 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema735 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
