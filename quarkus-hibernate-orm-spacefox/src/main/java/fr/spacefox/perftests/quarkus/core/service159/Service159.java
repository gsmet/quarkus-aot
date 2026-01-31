package fr.spacefox.perftests.quarkus.core.service159;

import fr.spacefox.perftests.quarkus.core.port.data.Entity159DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service159.model.Model159;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service159 {

    private final Entity159DatasourcePort datasource;

    public Service159(Entity159DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model159 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
