package fr.spacefox.perftests.quarkus.core.service31;

import fr.spacefox.perftests.quarkus.core.port.data.Entity31DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service31.model.Model31;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service31 {

    private final Entity31DatasourcePort datasource;

    public Service31(Entity31DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model31 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
