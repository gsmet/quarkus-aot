package fr.spacefox.perftests.quarkus.core.service504;

import fr.spacefox.perftests.quarkus.core.port.data.Entity504DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service504.model.Model504;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service504 {

    private final Entity504DatasourcePort datasource;

    public Service504(Entity504DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model504 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
