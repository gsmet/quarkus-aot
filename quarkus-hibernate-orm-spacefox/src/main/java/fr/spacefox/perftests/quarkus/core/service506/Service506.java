package fr.spacefox.perftests.quarkus.core.service506;

import fr.spacefox.perftests.quarkus.core.port.data.Entity506DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service506.model.Model506;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service506 {

    private final Entity506DatasourcePort datasource;

    public Service506(Entity506DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model506 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
