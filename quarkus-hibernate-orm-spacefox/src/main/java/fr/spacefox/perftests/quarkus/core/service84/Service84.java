package fr.spacefox.perftests.quarkus.core.service84;

import fr.spacefox.perftests.quarkus.core.port.data.Entity84DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service84.model.Model84;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service84 {

    private final Entity84DatasourcePort datasource;

    public Service84(Entity84DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model84 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
