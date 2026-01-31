package fr.spacefox.perftests.quarkus.rest.endpoint211;

import fr.spacefox.perftests.quarkus.core.service211.Service211;
import fr.spacefox.perftests.quarkus.rest.endpoint211.schema.Schema211;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint211")
public class Endpoint211Resource {

    private final Service211 service;

    public Endpoint211Resource(Service211 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema211 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
