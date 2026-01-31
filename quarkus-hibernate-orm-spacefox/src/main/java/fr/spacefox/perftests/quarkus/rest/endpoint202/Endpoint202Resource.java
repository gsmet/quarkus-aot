package fr.spacefox.perftests.quarkus.rest.endpoint202;

import fr.spacefox.perftests.quarkus.core.service202.Service202;
import fr.spacefox.perftests.quarkus.rest.endpoint202.schema.Schema202;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint202")
public class Endpoint202Resource {

    private final Service202 service;

    public Endpoint202Resource(Service202 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema202 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
