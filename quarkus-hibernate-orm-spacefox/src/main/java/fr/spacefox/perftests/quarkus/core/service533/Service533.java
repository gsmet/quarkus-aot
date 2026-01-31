package fr.spacefox.perftests.quarkus.core.service533;

import fr.spacefox.perftests.quarkus.core.port.data.Entity533DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service533.model.Model533;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service533 {

    private final Entity533DatasourcePort datasource;

    public Service533(Entity533DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model533 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
