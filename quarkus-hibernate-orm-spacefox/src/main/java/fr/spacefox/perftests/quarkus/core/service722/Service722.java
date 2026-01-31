package fr.spacefox.perftests.quarkus.core.service722;

import fr.spacefox.perftests.quarkus.core.port.data.Entity722DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service722.model.Model722;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service722 {

    private final Entity722DatasourcePort datasource;

    public Service722(Entity722DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model722 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
