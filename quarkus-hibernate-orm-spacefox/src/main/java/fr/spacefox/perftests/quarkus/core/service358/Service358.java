package fr.spacefox.perftests.quarkus.core.service358;

import fr.spacefox.perftests.quarkus.core.port.data.Entity358DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service358.model.Model358;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service358 {

    private final Entity358DatasourcePort datasource;

    public Service358(Entity358DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model358 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
