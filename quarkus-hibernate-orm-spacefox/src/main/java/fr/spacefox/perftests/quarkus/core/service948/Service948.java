package fr.spacefox.perftests.quarkus.core.service948;

import fr.spacefox.perftests.quarkus.core.port.data.Entity948DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service948.model.Model948;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service948 {

    private final Entity948DatasourcePort datasource;

    public Service948(Entity948DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model948 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
