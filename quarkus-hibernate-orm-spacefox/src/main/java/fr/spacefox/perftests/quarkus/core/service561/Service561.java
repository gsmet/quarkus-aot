package fr.spacefox.perftests.quarkus.core.service561;

import fr.spacefox.perftests.quarkus.core.port.data.Entity561DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service561.model.Model561;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service561 {

    private final Entity561DatasourcePort datasource;

    public Service561(Entity561DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model561 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
