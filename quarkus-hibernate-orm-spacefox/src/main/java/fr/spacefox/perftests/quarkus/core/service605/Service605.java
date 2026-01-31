package fr.spacefox.perftests.quarkus.core.service605;

import fr.spacefox.perftests.quarkus.core.port.data.Entity605DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service605.model.Model605;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service605 {

    private final Entity605DatasourcePort datasource;

    public Service605(Entity605DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model605 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
