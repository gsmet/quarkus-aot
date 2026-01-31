package fr.spacefox.perftests.quarkus.core.service293;

import fr.spacefox.perftests.quarkus.core.port.data.Entity293DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service293.model.Model293;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service293 {

    private final Entity293DatasourcePort datasource;

    public Service293(Entity293DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model293 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
