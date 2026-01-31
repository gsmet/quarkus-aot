package fr.spacefox.perftests.quarkus.core.service741;

import fr.spacefox.perftests.quarkus.core.port.data.Entity741DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service741.model.Model741;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service741 {

    private final Entity741DatasourcePort datasource;

    public Service741(Entity741DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model741 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
