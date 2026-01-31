package fr.spacefox.perftests.quarkus.rest.endpoint830;

import fr.spacefox.perftests.quarkus.core.service830.Service830;
import fr.spacefox.perftests.quarkus.rest.endpoint830.schema.Schema830;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint830")
public class Endpoint830Resource {

    private final Service830 service;

    public Endpoint830Resource(Service830 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema830 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
