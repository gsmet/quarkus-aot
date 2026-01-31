package fr.spacefox.perftests.quarkus.rest.endpoint995;

import fr.spacefox.perftests.quarkus.core.service995.Service995;
import fr.spacefox.perftests.quarkus.rest.endpoint995.schema.Schema995;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint995")
public class Endpoint995Resource {

    private final Service995 service;

    public Endpoint995Resource(Service995 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema995 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
