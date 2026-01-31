package fr.spacefox.perftests.quarkus.core.service653;

import fr.spacefox.perftests.quarkus.core.port.data.Entity653DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service653.model.Model653;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service653 {

    private final Entity653DatasourcePort datasource;

    public Service653(Entity653DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model653 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
