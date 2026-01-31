package fr.spacefox.perftests.quarkus.core.service93;

import fr.spacefox.perftests.quarkus.core.port.data.Entity93DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service93.model.Model93;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service93 {

    private final Entity93DatasourcePort datasource;

    public Service93(Entity93DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model93 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
