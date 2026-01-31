package fr.spacefox.perftests.quarkus.core.service336;

import fr.spacefox.perftests.quarkus.core.port.data.Entity336DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service336.model.Model336;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service336 {

    private final Entity336DatasourcePort datasource;

    public Service336(Entity336DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model336 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
