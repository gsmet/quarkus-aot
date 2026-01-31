package fr.spacefox.perftests.quarkus.core.service589;

import fr.spacefox.perftests.quarkus.core.port.data.Entity589DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service589.model.Model589;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service589 {

    private final Entity589DatasourcePort datasource;

    public Service589(Entity589DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model589 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
