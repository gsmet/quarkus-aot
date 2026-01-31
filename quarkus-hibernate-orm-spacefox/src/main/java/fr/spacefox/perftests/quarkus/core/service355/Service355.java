package fr.spacefox.perftests.quarkus.core.service355;

import fr.spacefox.perftests.quarkus.core.port.data.Entity355DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service355.model.Model355;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service355 {

    private final Entity355DatasourcePort datasource;

    public Service355(Entity355DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model355 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
