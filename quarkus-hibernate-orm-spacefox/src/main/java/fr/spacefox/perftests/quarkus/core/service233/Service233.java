package fr.spacefox.perftests.quarkus.core.service233;

import fr.spacefox.perftests.quarkus.core.port.data.Entity233DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service233.model.Model233;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service233 {

    private final Entity233DatasourcePort datasource;

    public Service233(Entity233DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model233 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
