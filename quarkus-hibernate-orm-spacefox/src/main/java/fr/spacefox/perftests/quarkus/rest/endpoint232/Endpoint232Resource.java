package fr.spacefox.perftests.quarkus.rest.endpoint232;

import fr.spacefox.perftests.quarkus.core.service232.Service232;
import fr.spacefox.perftests.quarkus.rest.endpoint232.schema.Schema232;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint232")
public class Endpoint232Resource {

    private final Service232 service;

    public Endpoint232Resource(Service232 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema232 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
