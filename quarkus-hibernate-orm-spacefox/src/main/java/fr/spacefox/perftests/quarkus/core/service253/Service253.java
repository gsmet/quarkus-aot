package fr.spacefox.perftests.quarkus.core.service253;

import fr.spacefox.perftests.quarkus.core.port.data.Entity253DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service253.model.Model253;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service253 {

    private final Entity253DatasourcePort datasource;

    public Service253(Entity253DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model253 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
