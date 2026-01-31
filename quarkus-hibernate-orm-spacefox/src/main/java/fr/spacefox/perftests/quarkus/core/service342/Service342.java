package fr.spacefox.perftests.quarkus.core.service342;

import fr.spacefox.perftests.quarkus.core.port.data.Entity342DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service342.model.Model342;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service342 {

    private final Entity342DatasourcePort datasource;

    public Service342(Entity342DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model342 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
