package fr.spacefox.perftests.quarkus.core.service826;

import fr.spacefox.perftests.quarkus.core.port.data.Entity826DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service826.model.Model826;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service826 {

    private final Entity826DatasourcePort datasource;

    public Service826(Entity826DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model826 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
