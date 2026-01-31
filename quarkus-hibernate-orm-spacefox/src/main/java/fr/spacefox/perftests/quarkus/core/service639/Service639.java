package fr.spacefox.perftests.quarkus.core.service639;

import fr.spacefox.perftests.quarkus.core.port.data.Entity639DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service639.model.Model639;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service639 {

    private final Entity639DatasourcePort datasource;

    public Service639(Entity639DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model639 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
