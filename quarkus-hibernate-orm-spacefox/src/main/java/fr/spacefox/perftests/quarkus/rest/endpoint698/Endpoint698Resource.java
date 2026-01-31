package fr.spacefox.perftests.quarkus.rest.endpoint698;

import fr.spacefox.perftests.quarkus.core.service698.Service698;
import fr.spacefox.perftests.quarkus.rest.endpoint698.schema.Schema698;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint698")
public class Endpoint698Resource {

    private final Service698 service;

    public Endpoint698Resource(Service698 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema698 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
