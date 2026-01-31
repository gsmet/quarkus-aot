package fr.spacefox.perftests.quarkus.core.service101;

import fr.spacefox.perftests.quarkus.core.port.data.Entity101DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service101.model.Model101;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service101 {

    private final Entity101DatasourcePort datasource;

    public Service101(Entity101DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model101 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
