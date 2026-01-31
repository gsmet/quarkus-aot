package fr.spacefox.perftests.quarkus.rest.endpoint386;

import fr.spacefox.perftests.quarkus.core.service386.Service386;
import fr.spacefox.perftests.quarkus.rest.endpoint386.schema.Schema386;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint386")
public class Endpoint386Resource {

    private final Service386 service;

    public Endpoint386Resource(Service386 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema386 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
