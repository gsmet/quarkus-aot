package fr.spacefox.perftests.quarkus.rest.endpoint572;

import fr.spacefox.perftests.quarkus.core.service572.Service572;
import fr.spacefox.perftests.quarkus.rest.endpoint572.schema.Schema572;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint572")
public class Endpoint572Resource {

    private final Service572 service;

    public Endpoint572Resource(Service572 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema572 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
