package fr.spacefox.perftests.quarkus.core.service458;

import fr.spacefox.perftests.quarkus.core.port.data.Entity458DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service458.model.Model458;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service458 {

    private final Entity458DatasourcePort datasource;

    public Service458(Entity458DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model458 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
