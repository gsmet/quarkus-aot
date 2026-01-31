package fr.spacefox.perftests.quarkus.rest.endpoint75;

import fr.spacefox.perftests.quarkus.core.service75.Service75;
import fr.spacefox.perftests.quarkus.rest.endpoint75.schema.Schema75;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint75")
public class Endpoint75Resource {

    private final Service75 service;

    public Endpoint75Resource(Service75 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema75 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
