package fr.spacefox.perftests.quarkus.rest.endpoint840;

import fr.spacefox.perftests.quarkus.core.service840.Service840;
import fr.spacefox.perftests.quarkus.rest.endpoint840.schema.Schema840;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint840")
public class Endpoint840Resource {

    private final Service840 service;

    public Endpoint840Resource(Service840 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema840 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
