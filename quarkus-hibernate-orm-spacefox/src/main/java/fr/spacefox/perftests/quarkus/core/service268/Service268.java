package fr.spacefox.perftests.quarkus.core.service268;

import fr.spacefox.perftests.quarkus.core.port.data.Entity268DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service268.model.Model268;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service268 {

    private final Entity268DatasourcePort datasource;

    public Service268(Entity268DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model268 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
