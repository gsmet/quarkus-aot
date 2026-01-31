package fr.spacefox.perftests.quarkus.rest.endpoint553;

import fr.spacefox.perftests.quarkus.core.service553.Service553;
import fr.spacefox.perftests.quarkus.rest.endpoint553.schema.Schema553;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint553")
public class Endpoint553Resource {

    private final Service553 service;

    public Endpoint553Resource(Service553 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema553 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
