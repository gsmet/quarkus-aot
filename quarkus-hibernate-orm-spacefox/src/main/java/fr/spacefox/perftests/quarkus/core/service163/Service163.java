package fr.spacefox.perftests.quarkus.core.service163;

import fr.spacefox.perftests.quarkus.core.port.data.Entity163DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service163.model.Model163;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service163 {

    private final Entity163DatasourcePort datasource;

    public Service163(Entity163DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model163 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
