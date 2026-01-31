package fr.spacefox.perftests.quarkus.core.service396;

import fr.spacefox.perftests.quarkus.core.port.data.Entity396DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service396.model.Model396;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service396 {

    private final Entity396DatasourcePort datasource;

    public Service396(Entity396DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model396 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
