package fr.spacefox.perftests.quarkus.core.service663;

import fr.spacefox.perftests.quarkus.core.port.data.Entity663DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service663.model.Model663;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service663 {

    private final Entity663DatasourcePort datasource;

    public Service663(Entity663DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model663 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
