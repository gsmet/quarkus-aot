package fr.spacefox.perftests.quarkus.rest.endpoint164;

import fr.spacefox.perftests.quarkus.core.service164.Service164;
import fr.spacefox.perftests.quarkus.rest.endpoint164.schema.Schema164;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint164")
public class Endpoint164Resource {

    private final Service164 service;

    public Endpoint164Resource(Service164 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema164 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
