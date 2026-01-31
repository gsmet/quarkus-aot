package fr.spacefox.perftests.quarkus.core.service964;

import fr.spacefox.perftests.quarkus.core.port.data.Entity964DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service964.model.Model964;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service964 {

    private final Entity964DatasourcePort datasource;

    public Service964(Entity964DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model964 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
