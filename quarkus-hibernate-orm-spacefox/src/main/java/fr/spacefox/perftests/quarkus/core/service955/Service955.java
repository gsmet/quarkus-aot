package fr.spacefox.perftests.quarkus.core.service955;

import fr.spacefox.perftests.quarkus.core.port.data.Entity955DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service955.model.Model955;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service955 {

    private final Entity955DatasourcePort datasource;

    public Service955(Entity955DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model955 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
