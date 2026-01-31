package fr.spacefox.perftests.quarkus.core.service567;

import fr.spacefox.perftests.quarkus.core.port.data.Entity567DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service567.model.Model567;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service567 {

    private final Entity567DatasourcePort datasource;

    public Service567(Entity567DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model567 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
