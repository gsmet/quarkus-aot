package fr.spacefox.perftests.quarkus.core.service323;

import fr.spacefox.perftests.quarkus.core.port.data.Entity323DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service323.model.Model323;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service323 {

    private final Entity323DatasourcePort datasource;

    public Service323(Entity323DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model323 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
