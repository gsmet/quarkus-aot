package fr.spacefox.perftests.quarkus.core.service38;

import fr.spacefox.perftests.quarkus.core.port.data.Entity38DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service38.model.Model38;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service38 {

    private final Entity38DatasourcePort datasource;

    public Service38(Entity38DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model38 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
