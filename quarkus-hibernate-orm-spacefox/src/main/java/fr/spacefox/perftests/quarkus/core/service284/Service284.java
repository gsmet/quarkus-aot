package fr.spacefox.perftests.quarkus.core.service284;

import fr.spacefox.perftests.quarkus.core.port.data.Entity284DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service284.model.Model284;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service284 {

    private final Entity284DatasourcePort datasource;

    public Service284(Entity284DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model284 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
