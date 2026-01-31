package fr.spacefox.perftests.quarkus.rest.endpoint666;

import fr.spacefox.perftests.quarkus.core.service666.Service666;
import fr.spacefox.perftests.quarkus.rest.endpoint666.schema.Schema666;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint666")
public class Endpoint666Resource {

    private final Service666 service;

    public Endpoint666Resource(Service666 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema666 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
