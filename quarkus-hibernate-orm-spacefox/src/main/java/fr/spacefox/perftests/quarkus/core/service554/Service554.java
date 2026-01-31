package fr.spacefox.perftests.quarkus.core.service554;

import fr.spacefox.perftests.quarkus.core.port.data.Entity554DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service554.model.Model554;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service554 {

    private final Entity554DatasourcePort datasource;

    public Service554(Entity554DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model554 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
