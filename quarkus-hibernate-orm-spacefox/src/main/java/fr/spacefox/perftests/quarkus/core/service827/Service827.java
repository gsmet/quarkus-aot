package fr.spacefox.perftests.quarkus.core.service827;

import fr.spacefox.perftests.quarkus.core.port.data.Entity827DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service827.model.Model827;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service827 {

    private final Entity827DatasourcePort datasource;

    public Service827(Entity827DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model827 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
