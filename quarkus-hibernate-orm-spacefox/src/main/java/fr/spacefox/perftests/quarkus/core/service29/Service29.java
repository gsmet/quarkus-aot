package fr.spacefox.perftests.quarkus.core.service29;

import fr.spacefox.perftests.quarkus.core.port.data.Entity29DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service29.model.Model29;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service29 {

    private final Entity29DatasourcePort datasource;

    public Service29(Entity29DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model29 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
