package fr.spacefox.perftests.quarkus.core.service877;

import fr.spacefox.perftests.quarkus.core.port.data.Entity877DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service877.model.Model877;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service877 {

    private final Entity877DatasourcePort datasource;

    public Service877(Entity877DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model877 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
