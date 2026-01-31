package fr.spacefox.perftests.quarkus.core.service166;

import fr.spacefox.perftests.quarkus.core.port.data.Entity166DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service166.model.Model166;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service166 {

    private final Entity166DatasourcePort datasource;

    public Service166(Entity166DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model166 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
