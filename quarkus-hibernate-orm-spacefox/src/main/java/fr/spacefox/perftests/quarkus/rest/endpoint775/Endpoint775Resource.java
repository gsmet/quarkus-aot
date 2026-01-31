package fr.spacefox.perftests.quarkus.rest.endpoint775;

import fr.spacefox.perftests.quarkus.core.service775.Service775;
import fr.spacefox.perftests.quarkus.rest.endpoint775.schema.Schema775;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint775")
public class Endpoint775Resource {

    private final Service775 service;

    public Endpoint775Resource(Service775 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema775 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
