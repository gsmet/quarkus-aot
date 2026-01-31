package fr.spacefox.perftests.quarkus.core.service665;

import fr.spacefox.perftests.quarkus.core.port.data.Entity665DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service665.model.Model665;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service665 {

    private final Entity665DatasourcePort datasource;

    public Service665(Entity665DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model665 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
