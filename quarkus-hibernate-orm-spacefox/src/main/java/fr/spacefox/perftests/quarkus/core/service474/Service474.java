package fr.spacefox.perftests.quarkus.core.service474;

import fr.spacefox.perftests.quarkus.core.port.data.Entity474DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service474.model.Model474;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service474 {

    private final Entity474DatasourcePort datasource;

    public Service474(Entity474DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model474 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
