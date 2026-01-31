package fr.spacefox.perftests.quarkus.core.service487;

import fr.spacefox.perftests.quarkus.core.port.data.Entity487DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service487.model.Model487;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service487 {

    private final Entity487DatasourcePort datasource;

    public Service487(Entity487DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model487 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
