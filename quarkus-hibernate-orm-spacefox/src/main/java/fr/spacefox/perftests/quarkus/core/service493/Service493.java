package fr.spacefox.perftests.quarkus.core.service493;

import fr.spacefox.perftests.quarkus.core.port.data.Entity493DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service493.model.Model493;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service493 {

    private final Entity493DatasourcePort datasource;

    public Service493(Entity493DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model493 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
