package fr.spacefox.perftests.quarkus.rest.endpoint567;

import fr.spacefox.perftests.quarkus.core.service567.Service567;
import fr.spacefox.perftests.quarkus.rest.endpoint567.schema.Schema567;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint567")
public class Endpoint567Resource {

    private final Service567 service;

    public Endpoint567Resource(Service567 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema567 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
