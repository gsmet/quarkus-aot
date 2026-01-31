package fr.spacefox.perftests.quarkus.core.service351;

import fr.spacefox.perftests.quarkus.core.port.data.Entity351DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service351.model.Model351;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service351 {

    private final Entity351DatasourcePort datasource;

    public Service351(Entity351DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model351 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
