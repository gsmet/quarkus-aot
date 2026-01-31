package fr.spacefox.perftests.quarkus.core.service94;

import fr.spacefox.perftests.quarkus.core.port.data.Entity94DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service94.model.Model94;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service94 {

    private final Entity94DatasourcePort datasource;

    public Service94(Entity94DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model94 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
