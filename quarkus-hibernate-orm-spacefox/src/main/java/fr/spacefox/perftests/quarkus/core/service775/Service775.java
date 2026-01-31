package fr.spacefox.perftests.quarkus.core.service775;

import fr.spacefox.perftests.quarkus.core.port.data.Entity775DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service775.model.Model775;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service775 {

    private final Entity775DatasourcePort datasource;

    public Service775(Entity775DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model775 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
