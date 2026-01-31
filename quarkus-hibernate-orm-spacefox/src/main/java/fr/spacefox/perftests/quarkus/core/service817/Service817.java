package fr.spacefox.perftests.quarkus.core.service817;

import fr.spacefox.perftests.quarkus.core.port.data.Entity817DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service817.model.Model817;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service817 {

    private final Entity817DatasourcePort datasource;

    public Service817(Entity817DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model817 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
