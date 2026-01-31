package fr.spacefox.perftests.quarkus.rest.endpoint155;

import fr.spacefox.perftests.quarkus.core.service155.Service155;
import fr.spacefox.perftests.quarkus.rest.endpoint155.schema.Schema155;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint155")
public class Endpoint155Resource {

    private final Service155 service;

    public Endpoint155Resource(Service155 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema155 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
