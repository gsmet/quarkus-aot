package fr.spacefox.perftests.quarkus.core.service92;

import fr.spacefox.perftests.quarkus.core.port.data.Entity92DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service92.model.Model92;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service92 {

    private final Entity92DatasourcePort datasource;

    public Service92(Entity92DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model92 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
