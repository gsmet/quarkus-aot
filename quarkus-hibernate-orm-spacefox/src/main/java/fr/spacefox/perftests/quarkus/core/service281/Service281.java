package fr.spacefox.perftests.quarkus.core.service281;

import fr.spacefox.perftests.quarkus.core.port.data.Entity281DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service281.model.Model281;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service281 {

    private final Entity281DatasourcePort datasource;

    public Service281(Entity281DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model281 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
