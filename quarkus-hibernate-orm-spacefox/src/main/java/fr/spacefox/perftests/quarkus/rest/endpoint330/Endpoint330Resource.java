package fr.spacefox.perftests.quarkus.rest.endpoint330;

import fr.spacefox.perftests.quarkus.core.service330.Service330;
import fr.spacefox.perftests.quarkus.rest.endpoint330.schema.Schema330;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint330")
public class Endpoint330Resource {

    private final Service330 service;

    public Endpoint330Resource(Service330 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema330 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
