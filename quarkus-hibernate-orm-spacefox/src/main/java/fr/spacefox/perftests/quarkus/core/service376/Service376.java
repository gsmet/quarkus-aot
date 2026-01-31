package fr.spacefox.perftests.quarkus.core.service376;

import fr.spacefox.perftests.quarkus.core.port.data.Entity376DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service376.model.Model376;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service376 {

    private final Entity376DatasourcePort datasource;

    public Service376(Entity376DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model376 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
