package fr.spacefox.perftests.quarkus.rest.endpoint758;

import fr.spacefox.perftests.quarkus.core.service758.Service758;
import fr.spacefox.perftests.quarkus.rest.endpoint758.schema.Schema758;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint758")
public class Endpoint758Resource {

    private final Service758 service;

    public Endpoint758Resource(Service758 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema758 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
