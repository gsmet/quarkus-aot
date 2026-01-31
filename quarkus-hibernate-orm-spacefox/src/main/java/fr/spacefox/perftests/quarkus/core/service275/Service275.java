package fr.spacefox.perftests.quarkus.core.service275;

import fr.spacefox.perftests.quarkus.core.port.data.Entity275DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service275.model.Model275;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service275 {

    private final Entity275DatasourcePort datasource;

    public Service275(Entity275DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model275 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
