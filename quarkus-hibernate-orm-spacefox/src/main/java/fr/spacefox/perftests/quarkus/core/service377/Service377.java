package fr.spacefox.perftests.quarkus.core.service377;

import fr.spacefox.perftests.quarkus.core.port.data.Entity377DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service377.model.Model377;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service377 {

    private final Entity377DatasourcePort datasource;

    public Service377(Entity377DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model377 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
