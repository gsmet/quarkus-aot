package fr.spacefox.perftests.quarkus.core.service402;

import fr.spacefox.perftests.quarkus.core.port.data.Entity402DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service402.model.Model402;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service402 {

    private final Entity402DatasourcePort datasource;

    public Service402(Entity402DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model402 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
