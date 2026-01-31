package fr.spacefox.perftests.quarkus.core.service247;

import fr.spacefox.perftests.quarkus.core.port.data.Entity247DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service247.model.Model247;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service247 {

    private final Entity247DatasourcePort datasource;

    public Service247(Entity247DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model247 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
