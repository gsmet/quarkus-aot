package fr.spacefox.perftests.quarkus.core.service519;

import fr.spacefox.perftests.quarkus.core.port.data.Entity519DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service519.model.Model519;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service519 {

    private final Entity519DatasourcePort datasource;

    public Service519(Entity519DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model519 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
