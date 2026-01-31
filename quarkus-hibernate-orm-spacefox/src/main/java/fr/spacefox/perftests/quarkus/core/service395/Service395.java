package fr.spacefox.perftests.quarkus.core.service395;

import fr.spacefox.perftests.quarkus.core.port.data.Entity395DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service395.model.Model395;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service395 {

    private final Entity395DatasourcePort datasource;

    public Service395(Entity395DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model395 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
