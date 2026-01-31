package fr.spacefox.perftests.quarkus.core.service950;

import fr.spacefox.perftests.quarkus.core.port.data.Entity950DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service950.model.Model950;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service950 {

    private final Entity950DatasourcePort datasource;

    public Service950(Entity950DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model950 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
