package fr.spacefox.perftests.quarkus.core.service669;

import fr.spacefox.perftests.quarkus.core.port.data.Entity669DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service669.model.Model669;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service669 {

    private final Entity669DatasourcePort datasource;

    public Service669(Entity669DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model669 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
