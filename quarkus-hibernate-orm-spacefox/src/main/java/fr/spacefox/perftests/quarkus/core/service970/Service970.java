package fr.spacefox.perftests.quarkus.core.service970;

import fr.spacefox.perftests.quarkus.core.port.data.Entity970DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service970.model.Model970;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service970 {

    private final Entity970DatasourcePort datasource;

    public Service970(Entity970DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model970 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
