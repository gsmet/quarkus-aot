package fr.spacefox.perftests.quarkus.core.service460;

import fr.spacefox.perftests.quarkus.core.port.data.Entity460DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service460.model.Model460;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service460 {

    private final Entity460DatasourcePort datasource;

    public Service460(Entity460DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model460 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
