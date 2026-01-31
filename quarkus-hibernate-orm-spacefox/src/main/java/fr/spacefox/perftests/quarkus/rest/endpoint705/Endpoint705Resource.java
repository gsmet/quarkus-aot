package fr.spacefox.perftests.quarkus.rest.endpoint705;

import fr.spacefox.perftests.quarkus.core.service705.Service705;
import fr.spacefox.perftests.quarkus.rest.endpoint705.schema.Schema705;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint705")
public class Endpoint705Resource {

    private final Service705 service;

    public Endpoint705Resource(Service705 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema705 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
