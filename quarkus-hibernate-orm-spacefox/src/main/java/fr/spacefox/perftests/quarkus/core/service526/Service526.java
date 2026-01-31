package fr.spacefox.perftests.quarkus.core.service526;

import fr.spacefox.perftests.quarkus.core.port.data.Entity526DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service526.model.Model526;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service526 {

    private final Entity526DatasourcePort datasource;

    public Service526(Entity526DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model526 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
