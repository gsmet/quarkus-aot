package fr.spacefox.perftests.quarkus.core.service845;

import fr.spacefox.perftests.quarkus.core.port.data.Entity845DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service845.model.Model845;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service845 {

    private final Entity845DatasourcePort datasource;

    public Service845(Entity845DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model845 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
