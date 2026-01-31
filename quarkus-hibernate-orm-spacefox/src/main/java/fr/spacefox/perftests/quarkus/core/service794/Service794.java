package fr.spacefox.perftests.quarkus.core.service794;

import fr.spacefox.perftests.quarkus.core.port.data.Entity794DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service794.model.Model794;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service794 {

    private final Entity794DatasourcePort datasource;

    public Service794(Entity794DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model794 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
