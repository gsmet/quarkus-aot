package fr.spacefox.perftests.quarkus.core.service372;

import fr.spacefox.perftests.quarkus.core.port.data.Entity372DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service372.model.Model372;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service372 {

    private final Entity372DatasourcePort datasource;

    public Service372(Entity372DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model372 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
