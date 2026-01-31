package fr.spacefox.perftests.quarkus.core.service896;

import fr.spacefox.perftests.quarkus.core.port.data.Entity896DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service896.model.Model896;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service896 {

    private final Entity896DatasourcePort datasource;

    public Service896(Entity896DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model896 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
