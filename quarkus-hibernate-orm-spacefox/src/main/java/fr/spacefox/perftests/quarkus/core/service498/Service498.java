package fr.spacefox.perftests.quarkus.core.service498;

import fr.spacefox.perftests.quarkus.core.port.data.Entity498DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service498.model.Model498;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service498 {

    private final Entity498DatasourcePort datasource;

    public Service498(Entity498DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model498 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
