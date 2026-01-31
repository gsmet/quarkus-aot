package fr.spacefox.perftests.quarkus.rest.endpoint770;

import fr.spacefox.perftests.quarkus.core.service770.Service770;
import fr.spacefox.perftests.quarkus.rest.endpoint770.schema.Schema770;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint770")
public class Endpoint770Resource {

    private final Service770 service;

    public Endpoint770Resource(Service770 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema770 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
