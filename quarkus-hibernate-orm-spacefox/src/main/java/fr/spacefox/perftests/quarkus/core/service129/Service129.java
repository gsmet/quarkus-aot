package fr.spacefox.perftests.quarkus.core.service129;

import fr.spacefox.perftests.quarkus.core.port.data.Entity129DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service129.model.Model129;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service129 {

    private final Entity129DatasourcePort datasource;

    public Service129(Entity129DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model129 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
