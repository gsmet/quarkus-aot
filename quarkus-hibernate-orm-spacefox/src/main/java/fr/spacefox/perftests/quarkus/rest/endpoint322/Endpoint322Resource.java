package fr.spacefox.perftests.quarkus.rest.endpoint322;

import fr.spacefox.perftests.quarkus.core.service322.Service322;
import fr.spacefox.perftests.quarkus.rest.endpoint322.schema.Schema322;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint322")
public class Endpoint322Resource {

    private final Service322 service;

    public Endpoint322Resource(Service322 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema322 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
