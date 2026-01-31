package fr.spacefox.perftests.quarkus.core.service96;

import fr.spacefox.perftests.quarkus.core.port.data.Entity96DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service96.model.Model96;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service96 {

    private final Entity96DatasourcePort datasource;

    public Service96(Entity96DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model96 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
