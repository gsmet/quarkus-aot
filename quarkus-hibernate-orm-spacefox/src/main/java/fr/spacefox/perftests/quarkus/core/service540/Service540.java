package fr.spacefox.perftests.quarkus.core.service540;

import fr.spacefox.perftests.quarkus.core.port.data.Entity540DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service540.model.Model540;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service540 {

    private final Entity540DatasourcePort datasource;

    public Service540(Entity540DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model540 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
