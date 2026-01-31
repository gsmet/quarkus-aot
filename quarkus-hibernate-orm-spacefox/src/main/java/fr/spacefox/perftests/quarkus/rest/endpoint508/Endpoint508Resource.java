package fr.spacefox.perftests.quarkus.rest.endpoint508;

import fr.spacefox.perftests.quarkus.core.service508.Service508;
import fr.spacefox.perftests.quarkus.rest.endpoint508.schema.Schema508;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint508")
public class Endpoint508Resource {

    private final Service508 service;

    public Endpoint508Resource(Service508 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema508 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
