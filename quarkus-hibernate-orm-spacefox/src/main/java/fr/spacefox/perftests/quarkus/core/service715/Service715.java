package fr.spacefox.perftests.quarkus.core.service715;

import fr.spacefox.perftests.quarkus.core.port.data.Entity715DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service715.model.Model715;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service715 {

    private final Entity715DatasourcePort datasource;

    public Service715(Entity715DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model715 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
