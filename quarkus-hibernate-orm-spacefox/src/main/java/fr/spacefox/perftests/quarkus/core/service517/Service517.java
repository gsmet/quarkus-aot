package fr.spacefox.perftests.quarkus.core.service517;

import fr.spacefox.perftests.quarkus.core.port.data.Entity517DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service517.model.Model517;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service517 {

    private final Entity517DatasourcePort datasource;

    public Service517(Entity517DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model517 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
