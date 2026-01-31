package fr.spacefox.perftests.quarkus.core.service748;

import fr.spacefox.perftests.quarkus.core.port.data.Entity748DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service748.model.Model748;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service748 {

    private final Entity748DatasourcePort datasource;

    public Service748(Entity748DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model748 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
