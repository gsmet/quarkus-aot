package fr.spacefox.perftests.quarkus.core.service651;

import fr.spacefox.perftests.quarkus.core.port.data.Entity651DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service651.model.Model651;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service651 {

    private final Entity651DatasourcePort datasource;

    public Service651(Entity651DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model651 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
