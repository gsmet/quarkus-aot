package fr.spacefox.perftests.quarkus.core.service475;

import fr.spacefox.perftests.quarkus.core.port.data.Entity475DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service475.model.Model475;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service475 {

    private final Entity475DatasourcePort datasource;

    public Service475(Entity475DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model475 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
