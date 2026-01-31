package fr.spacefox.perftests.quarkus.rest.endpoint419;

import fr.spacefox.perftests.quarkus.core.service419.Service419;
import fr.spacefox.perftests.quarkus.rest.endpoint419.schema.Schema419;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint419")
public class Endpoint419Resource {

    private final Service419 service;

    public Endpoint419Resource(Service419 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema419 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
