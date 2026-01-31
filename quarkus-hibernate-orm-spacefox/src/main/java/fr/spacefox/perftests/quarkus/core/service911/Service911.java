package fr.spacefox.perftests.quarkus.core.service911;

import fr.spacefox.perftests.quarkus.core.port.data.Entity911DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service911.model.Model911;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service911 {

    private final Entity911DatasourcePort datasource;

    public Service911(Entity911DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model911 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
