package fr.spacefox.perftests.quarkus.core.service36;

import fr.spacefox.perftests.quarkus.core.port.data.Entity36DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service36.model.Model36;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service36 {

    private final Entity36DatasourcePort datasource;

    public Service36(Entity36DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model36 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
