package fr.spacefox.perftests.quarkus.core.service801;

import fr.spacefox.perftests.quarkus.core.port.data.Entity801DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service801.model.Model801;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service801 {

    private final Entity801DatasourcePort datasource;

    public Service801(Entity801DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model801 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
