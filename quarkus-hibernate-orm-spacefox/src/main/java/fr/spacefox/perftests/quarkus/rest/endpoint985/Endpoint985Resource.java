package fr.spacefox.perftests.quarkus.rest.endpoint985;

import fr.spacefox.perftests.quarkus.core.service985.Service985;
import fr.spacefox.perftests.quarkus.rest.endpoint985.schema.Schema985;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint985")
public class Endpoint985Resource {

    private final Service985 service;

    public Endpoint985Resource(Service985 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema985 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
