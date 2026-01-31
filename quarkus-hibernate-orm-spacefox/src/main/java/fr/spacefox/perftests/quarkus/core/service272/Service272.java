package fr.spacefox.perftests.quarkus.core.service272;

import fr.spacefox.perftests.quarkus.core.port.data.Entity272DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service272.model.Model272;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service272 {

    private final Entity272DatasourcePort datasource;

    public Service272(Entity272DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model272 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
