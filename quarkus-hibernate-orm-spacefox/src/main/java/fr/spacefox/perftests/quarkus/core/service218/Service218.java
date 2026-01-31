package fr.spacefox.perftests.quarkus.core.service218;

import fr.spacefox.perftests.quarkus.core.port.data.Entity218DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service218.model.Model218;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service218 {

    private final Entity218DatasourcePort datasource;

    public Service218(Entity218DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model218 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
