package fr.spacefox.perftests.quarkus.core.service983;

import fr.spacefox.perftests.quarkus.core.port.data.Entity983DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service983.model.Model983;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service983 {

    private final Entity983DatasourcePort datasource;

    public Service983(Entity983DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model983 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
