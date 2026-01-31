package fr.spacefox.perftests.quarkus.core.service604;

import fr.spacefox.perftests.quarkus.core.port.data.Entity604DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service604.model.Model604;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service604 {

    private final Entity604DatasourcePort datasource;

    public Service604(Entity604DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model604 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
