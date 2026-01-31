package fr.spacefox.perftests.quarkus.core.service158;

import fr.spacefox.perftests.quarkus.core.port.data.Entity158DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service158.model.Model158;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service158 {

    private final Entity158DatasourcePort datasource;

    public Service158(Entity158DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model158 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
