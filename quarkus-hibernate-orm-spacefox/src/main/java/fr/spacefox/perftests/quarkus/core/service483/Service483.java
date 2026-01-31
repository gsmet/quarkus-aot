package fr.spacefox.perftests.quarkus.core.service483;

import fr.spacefox.perftests.quarkus.core.port.data.Entity483DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service483.model.Model483;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service483 {

    private final Entity483DatasourcePort datasource;

    public Service483(Entity483DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model483 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
