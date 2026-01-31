package fr.spacefox.perftests.quarkus.core.service416;

import fr.spacefox.perftests.quarkus.core.port.data.Entity416DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service416.model.Model416;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service416 {

    private final Entity416DatasourcePort datasource;

    public Service416(Entity416DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model416 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
