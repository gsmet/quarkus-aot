package fr.spacefox.perftests.quarkus.rest.endpoint325;

import fr.spacefox.perftests.quarkus.core.service325.Service325;
import fr.spacefox.perftests.quarkus.rest.endpoint325.schema.Schema325;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint325")
public class Endpoint325Resource {

    private final Service325 service;

    public Endpoint325Resource(Service325 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema325 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
