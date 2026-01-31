package fr.spacefox.perftests.quarkus.core.service363;

import fr.spacefox.perftests.quarkus.core.port.data.Entity363DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service363.model.Model363;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service363 {

    private final Entity363DatasourcePort datasource;

    public Service363(Entity363DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model363 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
