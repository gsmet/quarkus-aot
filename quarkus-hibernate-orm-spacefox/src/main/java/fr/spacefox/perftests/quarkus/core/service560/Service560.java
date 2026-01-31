package fr.spacefox.perftests.quarkus.core.service560;

import fr.spacefox.perftests.quarkus.core.port.data.Entity560DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service560.model.Model560;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service560 {

    private final Entity560DatasourcePort datasource;

    public Service560(Entity560DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model560 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
