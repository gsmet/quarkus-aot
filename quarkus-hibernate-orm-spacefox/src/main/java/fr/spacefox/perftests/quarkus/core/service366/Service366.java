package fr.spacefox.perftests.quarkus.core.service366;

import fr.spacefox.perftests.quarkus.core.port.data.Entity366DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service366.model.Model366;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service366 {

    private final Entity366DatasourcePort datasource;

    public Service366(Entity366DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model366 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
