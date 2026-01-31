package fr.spacefox.perftests.quarkus.core.service399;

import fr.spacefox.perftests.quarkus.core.port.data.Entity399DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service399.model.Model399;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service399 {

    private final Entity399DatasourcePort datasource;

    public Service399(Entity399DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model399 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
