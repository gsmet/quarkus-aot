package fr.spacefox.perftests.quarkus.rest.endpoint478;

import fr.spacefox.perftests.quarkus.core.service478.Service478;
import fr.spacefox.perftests.quarkus.rest.endpoint478.schema.Schema478;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint478")
public class Endpoint478Resource {

    private final Service478 service;

    public Endpoint478Resource(Service478 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema478 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
