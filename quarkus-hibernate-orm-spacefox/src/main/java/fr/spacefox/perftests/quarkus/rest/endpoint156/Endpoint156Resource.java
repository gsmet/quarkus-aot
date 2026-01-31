package fr.spacefox.perftests.quarkus.rest.endpoint156;

import fr.spacefox.perftests.quarkus.core.service156.Service156;
import fr.spacefox.perftests.quarkus.rest.endpoint156.schema.Schema156;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint156")
public class Endpoint156Resource {

    private final Service156 service;

    public Endpoint156Resource(Service156 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema156 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
