package fr.spacefox.perftests.quarkus.core.service479;

import fr.spacefox.perftests.quarkus.core.port.data.Entity479DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service479.model.Model479;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service479 {

    private final Entity479DatasourcePort datasource;

    public Service479(Entity479DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model479 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
