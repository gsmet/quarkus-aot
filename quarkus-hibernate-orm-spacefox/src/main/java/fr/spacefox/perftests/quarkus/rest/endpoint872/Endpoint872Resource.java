package fr.spacefox.perftests.quarkus.rest.endpoint872;

import fr.spacefox.perftests.quarkus.core.service872.Service872;
import fr.spacefox.perftests.quarkus.rest.endpoint872.schema.Schema872;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint872")
public class Endpoint872Resource {

    private final Service872 service;

    public Endpoint872Resource(Service872 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema872 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
