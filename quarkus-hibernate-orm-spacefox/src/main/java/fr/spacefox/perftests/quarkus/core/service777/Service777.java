package fr.spacefox.perftests.quarkus.core.service777;

import fr.spacefox.perftests.quarkus.core.port.data.Entity777DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service777.model.Model777;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service777 {

    private final Entity777DatasourcePort datasource;

    public Service777(Entity777DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model777 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
