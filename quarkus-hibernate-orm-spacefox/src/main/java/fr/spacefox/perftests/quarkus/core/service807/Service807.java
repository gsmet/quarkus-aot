package fr.spacefox.perftests.quarkus.core.service807;

import fr.spacefox.perftests.quarkus.core.port.data.Entity807DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service807.model.Model807;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service807 {

    private final Entity807DatasourcePort datasource;

    public Service807(Entity807DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model807 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
