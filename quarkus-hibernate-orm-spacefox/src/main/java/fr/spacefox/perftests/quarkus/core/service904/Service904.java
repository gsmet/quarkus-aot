package fr.spacefox.perftests.quarkus.core.service904;

import fr.spacefox.perftests.quarkus.core.port.data.Entity904DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service904.model.Model904;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service904 {

    private final Entity904DatasourcePort datasource;

    public Service904(Entity904DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model904 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
