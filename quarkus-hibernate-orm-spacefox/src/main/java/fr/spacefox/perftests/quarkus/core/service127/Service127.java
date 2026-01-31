package fr.spacefox.perftests.quarkus.core.service127;

import fr.spacefox.perftests.quarkus.core.port.data.Entity127DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service127.model.Model127;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service127 {

    private final Entity127DatasourcePort datasource;

    public Service127(Entity127DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model127 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
