package fr.spacefox.perftests.quarkus.rest.endpoint371;

import fr.spacefox.perftests.quarkus.core.service371.Service371;
import fr.spacefox.perftests.quarkus.rest.endpoint371.schema.Schema371;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint371")
public class Endpoint371Resource {

    private final Service371 service;

    public Endpoint371Resource(Service371 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema371 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
