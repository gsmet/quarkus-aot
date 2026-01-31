package fr.spacefox.perftests.quarkus.core.service671;

import fr.spacefox.perftests.quarkus.core.port.data.Entity671DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service671.model.Model671;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service671 {

    private final Entity671DatasourcePort datasource;

    public Service671(Entity671DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model671 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
