package fr.spacefox.perftests.quarkus.rest.endpoint394;

import fr.spacefox.perftests.quarkus.core.service394.Service394;
import fr.spacefox.perftests.quarkus.rest.endpoint394.schema.Schema394;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint394")
public class Endpoint394Resource {

    private final Service394 service;

    public Endpoint394Resource(Service394 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema394 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
