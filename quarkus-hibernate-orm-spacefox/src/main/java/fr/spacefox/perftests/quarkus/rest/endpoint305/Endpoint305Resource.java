package fr.spacefox.perftests.quarkus.rest.endpoint305;

import fr.spacefox.perftests.quarkus.core.service305.Service305;
import fr.spacefox.perftests.quarkus.rest.endpoint305.schema.Schema305;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint305")
public class Endpoint305Resource {

    private final Service305 service;

    public Endpoint305Resource(Service305 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema305 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
