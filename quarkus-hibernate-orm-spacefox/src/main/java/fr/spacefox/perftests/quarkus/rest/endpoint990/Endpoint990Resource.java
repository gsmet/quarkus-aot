package fr.spacefox.perftests.quarkus.rest.endpoint990;

import fr.spacefox.perftests.quarkus.core.service990.Service990;
import fr.spacefox.perftests.quarkus.rest.endpoint990.schema.Schema990;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint990")
public class Endpoint990Resource {

    private final Service990 service;

    public Endpoint990Resource(Service990 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema990 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
