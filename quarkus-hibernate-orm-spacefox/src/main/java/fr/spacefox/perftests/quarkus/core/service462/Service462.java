package fr.spacefox.perftests.quarkus.core.service462;

import fr.spacefox.perftests.quarkus.core.port.data.Entity462DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service462.model.Model462;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service462 {

    private final Entity462DatasourcePort datasource;

    public Service462(Entity462DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model462 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
