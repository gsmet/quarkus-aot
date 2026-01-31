package fr.spacefox.perftests.quarkus.core.service280;

import fr.spacefox.perftests.quarkus.core.port.data.Entity280DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service280.model.Model280;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service280 {

    private final Entity280DatasourcePort datasource;

    public Service280(Entity280DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model280 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
