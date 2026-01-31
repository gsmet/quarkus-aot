package fr.spacefox.perftests.quarkus.core.service972;

import fr.spacefox.perftests.quarkus.core.port.data.Entity972DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service972.model.Model972;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service972 {

    private final Entity972DatasourcePort datasource;

    public Service972(Entity972DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model972 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
