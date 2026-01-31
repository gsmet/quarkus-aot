package fr.spacefox.perftests.quarkus.core.service21;

import fr.spacefox.perftests.quarkus.core.port.data.Entity21DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service21.model.Model21;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service21 {

    private final Entity21DatasourcePort datasource;

    public Service21(Entity21DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model21 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
