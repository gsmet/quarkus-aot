package fr.spacefox.perftests.quarkus.core.service661;

import fr.spacefox.perftests.quarkus.core.port.data.Entity661DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service661.model.Model661;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service661 {

    private final Entity661DatasourcePort datasource;

    public Service661(Entity661DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model661 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
