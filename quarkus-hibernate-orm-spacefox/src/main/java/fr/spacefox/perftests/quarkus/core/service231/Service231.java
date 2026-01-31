package fr.spacefox.perftests.quarkus.core.service231;

import fr.spacefox.perftests.quarkus.core.port.data.Entity231DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service231.model.Model231;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service231 {

    private final Entity231DatasourcePort datasource;

    public Service231(Entity231DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model231 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
