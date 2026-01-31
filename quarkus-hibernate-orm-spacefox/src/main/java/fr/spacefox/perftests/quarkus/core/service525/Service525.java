package fr.spacefox.perftests.quarkus.core.service525;

import fr.spacefox.perftests.quarkus.core.port.data.Entity525DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service525.model.Model525;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service525 {

    private final Entity525DatasourcePort datasource;

    public Service525(Entity525DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model525 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
