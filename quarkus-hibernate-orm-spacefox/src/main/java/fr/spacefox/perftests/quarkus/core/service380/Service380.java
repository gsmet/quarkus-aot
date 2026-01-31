package fr.spacefox.perftests.quarkus.core.service380;

import fr.spacefox.perftests.quarkus.core.port.data.Entity380DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service380.model.Model380;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service380 {

    private final Entity380DatasourcePort datasource;

    public Service380(Entity380DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model380 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
