package fr.spacefox.perftests.quarkus.core.service634;

import fr.spacefox.perftests.quarkus.core.port.data.Entity634DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service634.model.Model634;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service634 {

    private final Entity634DatasourcePort datasource;

    public Service634(Entity634DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model634 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
