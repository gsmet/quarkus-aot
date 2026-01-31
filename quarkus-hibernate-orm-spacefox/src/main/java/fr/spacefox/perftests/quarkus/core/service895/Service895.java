package fr.spacefox.perftests.quarkus.core.service895;

import fr.spacefox.perftests.quarkus.core.port.data.Entity895DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service895.model.Model895;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service895 {

    private final Entity895DatasourcePort datasource;

    public Service895(Entity895DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model895 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
