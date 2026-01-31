package fr.spacefox.perftests.quarkus.core.service477;

import fr.spacefox.perftests.quarkus.core.port.data.Entity477DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service477.model.Model477;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service477 {

    private final Entity477DatasourcePort datasource;

    public Service477(Entity477DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model477 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
