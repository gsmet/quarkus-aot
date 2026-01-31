package fr.spacefox.perftests.quarkus.core.service591;

import fr.spacefox.perftests.quarkus.core.port.data.Entity591DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service591.model.Model591;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service591 {

    private final Entity591DatasourcePort datasource;

    public Service591(Entity591DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model591 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
