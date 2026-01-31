package fr.spacefox.perftests.quarkus.core.service126;

import fr.spacefox.perftests.quarkus.core.port.data.Entity126DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service126.model.Model126;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service126 {

    private final Entity126DatasourcePort datasource;

    public Service126(Entity126DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model126 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
