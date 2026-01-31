package fr.spacefox.perftests.quarkus.rest.endpoint604;

import fr.spacefox.perftests.quarkus.core.service604.Service604;
import fr.spacefox.perftests.quarkus.rest.endpoint604.schema.Schema604;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint604")
public class Endpoint604Resource {

    private final Service604 service;

    public Endpoint604Resource(Service604 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema604 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
