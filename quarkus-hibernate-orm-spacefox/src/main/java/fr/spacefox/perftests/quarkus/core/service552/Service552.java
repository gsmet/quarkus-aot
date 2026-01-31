package fr.spacefox.perftests.quarkus.core.service552;

import fr.spacefox.perftests.quarkus.core.port.data.Entity552DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service552.model.Model552;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service552 {

    private final Entity552DatasourcePort datasource;

    public Service552(Entity552DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model552 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
