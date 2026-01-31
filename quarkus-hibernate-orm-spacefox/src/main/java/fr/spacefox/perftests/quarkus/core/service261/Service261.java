package fr.spacefox.perftests.quarkus.core.service261;

import fr.spacefox.perftests.quarkus.core.port.data.Entity261DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service261.model.Model261;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service261 {

    private final Entity261DatasourcePort datasource;

    public Service261(Entity261DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model261 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
