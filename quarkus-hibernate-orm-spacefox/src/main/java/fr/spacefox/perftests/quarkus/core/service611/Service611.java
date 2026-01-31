package fr.spacefox.perftests.quarkus.core.service611;

import fr.spacefox.perftests.quarkus.core.port.data.Entity611DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service611.model.Model611;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service611 {

    private final Entity611DatasourcePort datasource;

    public Service611(Entity611DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model611 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
