package fr.spacefox.perftests.quarkus.core.service829;

import fr.spacefox.perftests.quarkus.core.port.data.Entity829DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service829.model.Model829;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service829 {

    private final Entity829DatasourcePort datasource;

    public Service829(Entity829DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model829 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
