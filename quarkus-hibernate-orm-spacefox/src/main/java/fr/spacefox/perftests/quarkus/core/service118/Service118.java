package fr.spacefox.perftests.quarkus.core.service118;

import fr.spacefox.perftests.quarkus.core.port.data.Entity118DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service118.model.Model118;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service118 {

    private final Entity118DatasourcePort datasource;

    public Service118(Entity118DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model118 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
