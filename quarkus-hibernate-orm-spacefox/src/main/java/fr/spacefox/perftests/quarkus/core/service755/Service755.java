package fr.spacefox.perftests.quarkus.core.service755;

import fr.spacefox.perftests.quarkus.core.port.data.Entity755DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service755.model.Model755;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service755 {

    private final Entity755DatasourcePort datasource;

    public Service755(Entity755DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model755 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
