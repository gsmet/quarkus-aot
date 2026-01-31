package fr.spacefox.perftests.quarkus.rest.endpoint209;

import fr.spacefox.perftests.quarkus.core.service209.Service209;
import fr.spacefox.perftests.quarkus.rest.endpoint209.schema.Schema209;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint209")
public class Endpoint209Resource {

    private final Service209 service;

    public Endpoint209Resource(Service209 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema209 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
