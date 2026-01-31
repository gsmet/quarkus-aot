package fr.spacefox.perftests.quarkus.core.service732;

import fr.spacefox.perftests.quarkus.core.port.data.Entity732DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service732.model.Model732;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service732 {

    private final Entity732DatasourcePort datasource;

    public Service732(Entity732DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model732 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
