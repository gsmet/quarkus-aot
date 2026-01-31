package fr.spacefox.perftests.quarkus.rest.endpoint952;

import fr.spacefox.perftests.quarkus.core.service952.Service952;
import fr.spacefox.perftests.quarkus.rest.endpoint952.schema.Schema952;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint952")
public class Endpoint952Resource {

    private final Service952 service;

    public Endpoint952Resource(Service952 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema952 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
