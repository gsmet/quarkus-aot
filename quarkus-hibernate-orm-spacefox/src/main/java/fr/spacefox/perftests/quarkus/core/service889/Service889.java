package fr.spacefox.perftests.quarkus.core.service889;

import fr.spacefox.perftests.quarkus.core.port.data.Entity889DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service889.model.Model889;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service889 {

    private final Entity889DatasourcePort datasource;

    public Service889(Entity889DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model889 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
