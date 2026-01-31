package fr.spacefox.perftests.quarkus.core.service61;

import fr.spacefox.perftests.quarkus.core.port.data.Entity61DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service61.model.Model61;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service61 {

    private final Entity61DatasourcePort datasource;

    public Service61(Entity61DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model61 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
