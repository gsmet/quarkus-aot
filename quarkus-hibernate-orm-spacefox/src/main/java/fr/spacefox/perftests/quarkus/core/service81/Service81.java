package fr.spacefox.perftests.quarkus.core.service81;

import fr.spacefox.perftests.quarkus.core.port.data.Entity81DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service81.model.Model81;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service81 {

    private final Entity81DatasourcePort datasource;

    public Service81(Entity81DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model81 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
