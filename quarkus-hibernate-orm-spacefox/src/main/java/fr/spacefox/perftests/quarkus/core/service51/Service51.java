package fr.spacefox.perftests.quarkus.core.service51;

import fr.spacefox.perftests.quarkus.core.port.data.Entity51DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service51.model.Model51;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service51 {

    private final Entity51DatasourcePort datasource;

    public Service51(Entity51DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model51 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
