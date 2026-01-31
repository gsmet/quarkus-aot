package fr.spacefox.perftests.quarkus.core.service657;

import fr.spacefox.perftests.quarkus.core.port.data.Entity657DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service657.model.Model657;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service657 {

    private final Entity657DatasourcePort datasource;

    public Service657(Entity657DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model657 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
