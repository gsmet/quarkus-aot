package fr.spacefox.perftests.quarkus.core.service389;

import fr.spacefox.perftests.quarkus.core.port.data.Entity389DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service389.model.Model389;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service389 {

    private final Entity389DatasourcePort datasource;

    public Service389(Entity389DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model389 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
