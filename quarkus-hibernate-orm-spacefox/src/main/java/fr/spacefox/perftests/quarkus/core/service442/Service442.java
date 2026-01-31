package fr.spacefox.perftests.quarkus.core.service442;

import fr.spacefox.perftests.quarkus.core.port.data.Entity442DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service442.model.Model442;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service442 {

    private final Entity442DatasourcePort datasource;

    public Service442(Entity442DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model442 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
