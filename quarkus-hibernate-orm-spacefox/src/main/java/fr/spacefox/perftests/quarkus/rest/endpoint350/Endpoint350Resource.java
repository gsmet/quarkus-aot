package fr.spacefox.perftests.quarkus.rest.endpoint350;

import fr.spacefox.perftests.quarkus.core.service350.Service350;
import fr.spacefox.perftests.quarkus.rest.endpoint350.schema.Schema350;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint350")
public class Endpoint350Resource {

    private final Service350 service;

    public Endpoint350Resource(Service350 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema350 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
