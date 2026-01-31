package fr.spacefox.perftests.quarkus.core.service707;

import fr.spacefox.perftests.quarkus.core.port.data.Entity707DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service707.model.Model707;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service707 {

    private final Entity707DatasourcePort datasource;

    public Service707(Entity707DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model707 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
