package fr.spacefox.perftests.quarkus.core.service160;

import fr.spacefox.perftests.quarkus.core.port.data.Entity160DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service160.model.Model160;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service160 {

    private final Entity160DatasourcePort datasource;

    public Service160(Entity160DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model160 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
