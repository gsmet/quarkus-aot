package fr.spacefox.perftests.quarkus.core.service317;

import fr.spacefox.perftests.quarkus.core.port.data.Entity317DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service317.model.Model317;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service317 {

    private final Entity317DatasourcePort datasource;

    public Service317(Entity317DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model317 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
