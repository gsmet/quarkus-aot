package fr.spacefox.perftests.quarkus.core.service635;

import fr.spacefox.perftests.quarkus.core.port.data.Entity635DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service635.model.Model635;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service635 {

    private final Entity635DatasourcePort datasource;

    public Service635(Entity635DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model635 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
