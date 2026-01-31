package fr.spacefox.perftests.quarkus.core.service503;

import fr.spacefox.perftests.quarkus.core.port.data.Entity503DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service503.model.Model503;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service503 {

    private final Entity503DatasourcePort datasource;

    public Service503(Entity503DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model503 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
