package fr.spacefox.perftests.quarkus.rest.endpoint837;

import fr.spacefox.perftests.quarkus.core.service837.Service837;
import fr.spacefox.perftests.quarkus.rest.endpoint837.schema.Schema837;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint837")
public class Endpoint837Resource {

    private final Service837 service;

    public Endpoint837Resource(Service837 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema837 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
