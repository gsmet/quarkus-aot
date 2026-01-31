package fr.spacefox.perftests.quarkus.core.service974;

import fr.spacefox.perftests.quarkus.core.port.data.Entity974DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service974.model.Model974;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service974 {

    private final Entity974DatasourcePort datasource;

    public Service974(Entity974DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model974 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
