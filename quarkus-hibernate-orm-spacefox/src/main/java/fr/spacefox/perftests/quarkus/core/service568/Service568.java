package fr.spacefox.perftests.quarkus.core.service568;

import fr.spacefox.perftests.quarkus.core.port.data.Entity568DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service568.model.Model568;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service568 {

    private final Entity568DatasourcePort datasource;

    public Service568(Entity568DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model568 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
