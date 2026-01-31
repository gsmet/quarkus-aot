package fr.spacefox.perftests.quarkus.core.service494;

import fr.spacefox.perftests.quarkus.core.port.data.Entity494DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service494.model.Model494;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service494 {

    private final Entity494DatasourcePort datasource;

    public Service494(Entity494DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model494 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
