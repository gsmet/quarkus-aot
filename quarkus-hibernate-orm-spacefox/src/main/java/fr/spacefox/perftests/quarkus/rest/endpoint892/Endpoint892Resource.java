package fr.spacefox.perftests.quarkus.rest.endpoint892;

import fr.spacefox.perftests.quarkus.core.service892.Service892;
import fr.spacefox.perftests.quarkus.rest.endpoint892.schema.Schema892;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint892")
public class Endpoint892Resource {

    private final Service892 service;

    public Endpoint892Resource(Service892 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema892 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
