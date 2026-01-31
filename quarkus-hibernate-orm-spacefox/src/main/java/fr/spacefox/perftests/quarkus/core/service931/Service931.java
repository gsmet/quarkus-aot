package fr.spacefox.perftests.quarkus.core.service931;

import fr.spacefox.perftests.quarkus.core.port.data.Entity931DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service931.model.Model931;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service931 {

    private final Entity931DatasourcePort datasource;

    public Service931(Entity931DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model931 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
