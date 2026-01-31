package fr.spacefox.perftests.quarkus.core.service139;

import fr.spacefox.perftests.quarkus.core.port.data.Entity139DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service139.model.Model139;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service139 {

    private final Entity139DatasourcePort datasource;

    public Service139(Entity139DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model139 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
