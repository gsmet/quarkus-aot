package fr.spacefox.perftests.quarkus.core.service522;

import fr.spacefox.perftests.quarkus.core.port.data.Entity522DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service522.model.Model522;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service522 {

    private final Entity522DatasourcePort datasource;

    public Service522(Entity522DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model522 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
