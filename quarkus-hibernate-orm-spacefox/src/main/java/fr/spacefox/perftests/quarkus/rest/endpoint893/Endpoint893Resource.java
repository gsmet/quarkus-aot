package fr.spacefox.perftests.quarkus.rest.endpoint893;

import fr.spacefox.perftests.quarkus.core.service893.Service893;
import fr.spacefox.perftests.quarkus.rest.endpoint893.schema.Schema893;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint893")
public class Endpoint893Resource {

    private final Service893 service;

    public Endpoint893Resource(Service893 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema893 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
