package fr.spacefox.perftests.quarkus.rest.endpoint433;

import fr.spacefox.perftests.quarkus.core.service433.Service433;
import fr.spacefox.perftests.quarkus.rest.endpoint433.schema.Schema433;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint433")
public class Endpoint433Resource {

    private final Service433 service;

    public Endpoint433Resource(Service433 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema433 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
