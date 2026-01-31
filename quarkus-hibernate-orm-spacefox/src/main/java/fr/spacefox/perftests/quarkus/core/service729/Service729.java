package fr.spacefox.perftests.quarkus.core.service729;

import fr.spacefox.perftests.quarkus.core.port.data.Entity729DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service729.model.Model729;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service729 {

    private final Entity729DatasourcePort datasource;

    public Service729(Entity729DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model729 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
