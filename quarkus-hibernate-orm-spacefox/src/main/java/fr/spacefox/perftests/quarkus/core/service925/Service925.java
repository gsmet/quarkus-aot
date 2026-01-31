package fr.spacefox.perftests.quarkus.core.service925;

import fr.spacefox.perftests.quarkus.core.port.data.Entity925DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service925.model.Model925;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service925 {

    private final Entity925DatasourcePort datasource;

    public Service925(Entity925DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model925 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
