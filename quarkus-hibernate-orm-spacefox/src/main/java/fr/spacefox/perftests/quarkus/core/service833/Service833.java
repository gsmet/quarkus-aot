package fr.spacefox.perftests.quarkus.core.service833;

import fr.spacefox.perftests.quarkus.core.port.data.Entity833DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service833.model.Model833;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service833 {

    private final Entity833DatasourcePort datasource;

    public Service833(Entity833DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model833 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
