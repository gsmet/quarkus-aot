package fr.spacefox.perftests.quarkus.core.service95;

import fr.spacefox.perftests.quarkus.core.port.data.Entity95DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service95.model.Model95;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service95 {

    private final Entity95DatasourcePort datasource;

    public Service95(Entity95DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model95 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
