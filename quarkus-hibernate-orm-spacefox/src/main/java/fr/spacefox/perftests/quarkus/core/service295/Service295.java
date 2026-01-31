package fr.spacefox.perftests.quarkus.core.service295;

import fr.spacefox.perftests.quarkus.core.port.data.Entity295DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service295.model.Model295;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service295 {

    private final Entity295DatasourcePort datasource;

    public Service295(Entity295DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model295 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
